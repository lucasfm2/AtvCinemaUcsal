package atvpooa1;

import java.util.ArrayList;
import java.util.List;

public class Sala {

	private List<Fila> filas;

	public Sala(int qtdfila, int qtdAssentosPorFila) {
		super();
		this.filas = new ArrayList<>();
		for (int i = 0; i < qtdfila; i++) {
			filas.add(new Fila(qtdAssentosPorFila));
		}

	}

	public int qtdFileiras() {
		return filas.size();
	}

	public int numeroAssentos() {
		if (!filas.isEmpty()) {
			Fila fileira = filas.get(1);
			return fileira.getQtdAssentos();
		}
		return 0;
	}

	public List<Fila> getFilas() {
		return filas;
	}

	

}
