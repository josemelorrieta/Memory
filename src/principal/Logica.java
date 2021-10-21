package principal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Logica {
	
	Ventana juego;
	Cronometro tiempo;
	
	ArrayList<JButton> tarjetas = new ArrayList<JButton>();
	ArrayList<String> imagenes = new ArrayList<String>();
	
	HashMap<JButton, String> patrones = new HashMap<JButton, String>();
	
	JButton tarjeta1, tarjeta2;	
	
	boolean enJuego = false;
	boolean jugada = false;
	
	public Logica(Ventana juego) {
		this.juego = juego;
		tiempo = new Cronometro(juego, this);
		
		tarjetas.add(juego.btn01);
		tarjetas.add(juego.btn02);
		tarjetas.add(juego.btn03);
		tarjetas.add(juego.btn04);
		tarjetas.add(juego.btn05);
		tarjetas.add(juego.btn06);
		tarjetas.add(juego.btn07);
		tarjetas.add(juego.btn08);
		tarjetas.add(juego.btn09);
		tarjetas.add(juego.btn10);
		tarjetas.add(juego.btn11);
		tarjetas.add(juego.btn12);
		
		imagenes.add("/images/01.png");
		imagenes.add("/images/02.png");
		imagenes.add("/images/03.png");
		imagenes.add("/images/04.png");
		imagenes.add("/images/05.png");
		imagenes.add("/images/06.png");
		imagenes.add("/images/01.png");
		imagenes.add("/images/02.png");
		imagenes.add("/images/03.png");
		imagenes.add("/images/04.png");
		imagenes.add("/images/05.png");
		imagenes.add("/images/06.png");
	}
	
	public void inicializarJuego() {
		tiempo.minutos = 1;
		tiempo.segundos = 0;
		
		juego.lblTiempo.setText(String.format("%02d", tiempo.minutos) + ":" + String.format("%02d", tiempo.segundos));
		
		mezclarTarjetas();
	}

	private void comenzarJuego() {
		enJuego = true;
		tiempo.start();
	}
	
	public void escucharMouse() {
		for (JButton tarjeta : tarjetas) {
			tarjeta.addMouseListener(new MouseListener() {
	
				@Override
				public void mouseClicked(MouseEvent e) {
				}
	
				@Override
				public void mousePressed(MouseEvent e) {
					
				}
	
				@Override
				public void mouseReleased(MouseEvent e) {
					
					if (!enJuego) {
						comenzarJuego();
					}
					
					if (tarjeta.isEnabled()) {
						tarjeta.setEnabled(false);
						tarjeta.setDisabledIcon(new ImageIcon(Ventana.class.getResource(patrones.get(tarjeta))));
					}
					
					// Si es la primera tarjeta levantada
					if (!jugada) {
						tarjeta1 = tarjeta;
					}
					// Si es la segunda tarjeta levantada
					else {
						tarjeta2 = tarjeta;
					}
				}
	
				@Override
				public void mouseEntered(MouseEvent e) {
					
				}
	
				@Override
				public void mouseExited(MouseEvent e) {
					
				}
				
			});
		}
	}
	
	private void mezclarTarjetas() {
		Random rand = new Random(System.currentTimeMillis());
		
		Collections.shuffle(imagenes, rand);
		
		for (int i=0; i < tarjetas.size(); i++) {
			patrones.put(tarjetas.get(i), imagenes.get(i));
		}
	}
}
