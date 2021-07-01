package atvpooa1;

import java.util.ArrayList;
import java.util.List;


public class CinemaDAO implements BancoDAO{

	private List<Cinema> cinemas = new ArrayList<Cinema>();
	
	@Override
	public void salvar(Cinema c) {
		salvar(c);
	}

	@Override
	public List<Cinema> lista() {
		cinemas.add(new Cinema(7, 8));
		return cinemas;
	}

}
