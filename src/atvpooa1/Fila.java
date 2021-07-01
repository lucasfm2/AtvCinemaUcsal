package atvpooa1;

import java.util.ArrayList;
import java.util.List;

public class Fila {

	private List<Assento> assentos;
	private int qtdAssentosPorFila;

	public Fila(int qtdAssentosPorFila) {
		this.assentos = new ArrayList<>();
		this.qtdAssentosPorFila = qtdAssentosPorFila;
		for (int i = 0; i < qtdAssentosPorFila; i++) {
			assentos.add(new Assento());
		}
	}

	public int numeroAssentosOcupados() {
		int ocupados = 0;
		for (Assento assento : assentos) {
			if(assento.isOcupado()) {
				ocupados++;
			}		
		}
		return ocupados;
	}
	
	public int assentos() {
		return assentos.size();
	}

	public List<Assento> getAssentos() {
		return assentos;
	}

	public int getQtdAssentos() {
		return qtdAssentosPorFila;
	}

}
