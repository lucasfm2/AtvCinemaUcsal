package atvpooa1;

import java.util.List;

public class Cinema {
	
	private Sala sala;
	
	public Cinema(int qtdFila,int qtdAssentosPorFila) {
		super();
		this.sala = new Sala(qtdFila,qtdAssentosPorFila);
	}
	
	public List<Fila> getFileiras() {
		if(!sala.getFilas().isEmpty()) {
			return sala.getFilas(); 
		}
		return null;
	}
	
	public List<Assento> getAssentos() {
		if(!sala.getFilas().get(0).getAssentos().isEmpty()) {
			return sala.getFilas().get(0).getAssentos(); 
		}
		return null;
	}
	
}
