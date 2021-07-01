package atvpooa1;



public class Main {

	public static void main(String[] args) {
		BancoDAO dao = new CinemaDAO();
		CinemaController cc = new CinemaController(dao);
		cc.exibirCinema();
		

	}

}
