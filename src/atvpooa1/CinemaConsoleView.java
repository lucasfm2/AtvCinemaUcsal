package atvpooa1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CinemaConsoleView {

	private Scanner console = new Scanner(System.in);
	private CinemaController controller;
	
	public CinemaConsoleView(List<Cinema> listaCinema) {	
		imprimirFileiras(listaCinema);
		
	}
	
	private void imprimirFileiras(List<Cinema> listaCinema) {
		String texto = new String();
		
		texto = gerarExibicaoFileira(listaCinema);
		texto = gerarExibicaoLinhaNumericaVertical(texto,listaCinema);
		texto = gerarExibicaoLinhaNumericaHorizontal(texto,listaCinema);
				
		System.out.println(texto);		
	}
	
	private String gerarExibicaoFileira(List<Cinema> listaCinema) {
		StringBuilder builder = new StringBuilder();		
		ArrayList<Cinema> cinemas = (ArrayList<Cinema>) listaCinema; 
		
		if(cinemas.isEmpty()) return null;
		if(cinemas.get(0).getFileiras().isEmpty()) return null;
		if(cinemas.get(0).getAssentos().isEmpty()) return null;
		
		List<Fila> fileiras = (ArrayList<Fila>) listaCinema.get(0).getFileiras();					
		List<Assento> assentos = (ArrayList<Assento>) listaCinema.get(0).getAssentos();		
		
		for (Fila fila : fileiras) {
			for (Assento assento : assentos) {
				builder.append(imprimirStatusDeOcupacao(assento));					
			}	
			builder.append("\n");
		}	
		return builder.toString();
	}
	
	private String imprimirStatusDeOcupacao(Assento assento) {
		return (assento.isOcupado() == true) ? " | S | " : " | N | " ;
	}
	
	private String gerarExibicaoLinhaNumericaVertical(String texto, List<Cinema> listaCinema) {
		String linhas[]=texto.split("\n"); String linhaNova = new String();
		
		for (int i = 1; i < linhas.length; i++) {
			linhaNova += "  "+i+"  "+ linhas[i]+"\n";
		}		
		return linhaNova;		
	}
	
	private String gerarExibicaoLinhaNumericaHorizontal(String texto, List<Cinema> listaCinema) {
		String linha = new String(); int i = 1; 
		ArrayList<Cinema> cinemas = (ArrayList<Cinema>) listaCinema; 
		
		if(cinemas.isEmpty()) return null;
		if(cinemas.get(0).getFileiras().isEmpty()) return null;
		if(cinemas.get(0).getAssentos().isEmpty()) return null;
		
		List<Assento> assentos = (ArrayList<Assento>) listaCinema.get(0).getAssentos();
		
		for (Assento assento : assentos){
			String numero = (assentos.get(0).equals(assento)) ? "  " : ""; 
			numero += "      " + i++ + "";
			linha += numero;
		}
		linha += "\n"; 
			
		return linha + texto;
		
	}
	
	
}
