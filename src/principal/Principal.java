package principal;


public class Principal {

	private boolean enJuego;


	public static void main(String[] args) {	
		
		Ventana juego = new Ventana();
		
		Logica logica = new Logica(juego);
		
		logica.inicializarJuego();
		logica.escucharMouse();

		juego.setLocationRelativeTo(null);
		juego.setVisible(true);
	}

}
