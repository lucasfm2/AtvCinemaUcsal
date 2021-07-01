package atvpooa1;

import java.util.List;

public interface BancoDAO {
	void salvar(Cinema c);

	List<Cinema> lista();
}
