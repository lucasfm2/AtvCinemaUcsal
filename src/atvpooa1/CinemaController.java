package atvpooa1;




public class CinemaController {

	private BancoDAO dao;

	public CinemaController(BancoDAO dao) {
		super();
		this.dao = dao;
	}
	
	public CinemaConsoleView exibirCinema() {
		return new CinemaConsoleView(dao.lista());		
	}
		
}
