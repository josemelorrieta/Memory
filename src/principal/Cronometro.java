package principal;

public class Cronometro implements Runnable {

	Thread reloj;
	Ventana juego;
	Logica logica;
		
	int minutos;
	int segundos;
	
	public Cronometro(Ventana juego, Logica logica) {
		this.reloj = new Thread(this);
		this.juego = juego;
		this.logica = logica;
	}
	
	
	@Override
	public void run() {
		while(logica.enJuego) {
			try {
				Thread.sleep(1000);
			}
			catch (Exception e){
				e.printStackTrace();
			}
			
			segundos--;
			if (segundos < 0) {
				segundos = 59;
				if (minutos >= 1) {
					minutos--;
				}
				else {
					segundos = 0;
					logica.enJuego = false;
				}
			}
			
			juego.lblTiempo.setText(String.format("%02d", minutos) + ":" + String.format("%02d", segundos));
			
		}
		
	}

	public void start() {
		reloj.start();
	}
	
}
