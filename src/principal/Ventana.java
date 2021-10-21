package principal;

import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Ventana extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public JLabel lblTiempo, lblAciertos;
	public JButton btn01, btn02, btn03, btn04, btn05, btn06,
				   btn07, btn08, btn09, btn10, btn11, btn12;  
	
	public Ventana() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(new Rectangle(new Dimension(800, 600)));
		getContentPane().setLayout(null);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(0, 0, 784, 40);
		panelTitulo.setLayout(null);
		getContentPane().add(panelTitulo);
		
		JPanel panelJuego = new JPanel();
		panelJuego.setBounds(0, 40, 784, 480);
		panelJuego.setLayout(null);
		getContentPane().add(panelJuego);
		
		btn01 = new JButton("");
		btn01.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn01.setBounds(91, 48, 100, 100);
		btn01.setBackground(new Color(150, 150, 150));
		panelJuego.add(btn01);
		
		btn02 = new JButton("");
		btn02.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn02.setBackground(new Color(150, 150, 150));
		btn02.setBounds(258, 48, 100, 100);
		panelJuego.add(btn02);
		
		btn03 = new JButton("");
		btn03.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn03.setBackground(new Color(150, 150, 150));
		btn03.setBounds(425, 48, 100, 100);
		panelJuego.add(btn03);
		
		btn04 = new JButton("");
		btn04.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn04.setBackground(new Color(150, 150, 150));
		btn04.setBounds(592, 48, 100, 100);
		panelJuego.add(btn04);
		
		btn05 = new JButton("");
		btn05.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn05.setBackground(new Color(150, 150, 150));
		btn05.setBounds(91, 190, 100, 100);
		panelJuego.add(btn05);
		
		btn06 = new JButton("");
		btn06.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn06.setBackground(new Color(150, 150, 150));
		btn06.setBounds(258, 190, 100, 100);
		panelJuego.add(btn06);
		
		btn07 = new JButton("");
		btn07.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn07.setBackground(new Color(150, 150, 150));
		btn07.setBounds(425, 190, 100, 100);
		panelJuego.add(btn07);
		
		btn08 = new JButton("");
		btn08.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn08.setBackground(new Color(150, 150, 150));
		btn08.setBounds(592, 190, 100, 100);
		panelJuego.add(btn08);
		
		btn09 = new JButton("");
		btn09.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn09.setBackground(new Color(150, 150, 150));
		btn09.setBounds(91, 332, 100, 100);
		panelJuego.add(btn09);
		
		btn10 = new JButton("");
		btn10.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn10.setBackground(new Color(150, 150, 150));
		btn10.setBounds(258, 332, 100, 100);
		panelJuego.add(btn10);
		
		btn11 = new JButton("");
		btn11.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn11.setBackground(new Color(150, 150, 150));
		btn11.setBounds(425, 332, 100, 100);
		panelJuego.add(btn11);
		
		btn12 = new JButton("");
		btn12.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn12.setBackground(new Color(150, 150, 150));
		btn12.setBounds(592, 332, 100, 100);
		panelJuego.add(btn12);
		
		JPanel panelEstado = new JPanel();
		panelEstado.setBounds(0, 520, 784, 40);
		panelEstado.setLayout(null);
		getContentPane().add(panelEstado);
		
		JLabel lblAciertosTxt = new JLabel("Aciertos:");
		lblAciertosTxt.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAciertosTxt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAciertosTxt.setBounds(288, 0, 100, 20);
		panelEstado.add(lblAciertosTxt);
		
		lblAciertos = new JLabel("0");
		lblAciertos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAciertos.setBounds(400, 0, 20, 20);
		panelEstado.add(lblAciertos);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setSize(780, 40);
		lblTitulo.setText("Memory");
		panelTitulo.add(lblTitulo);
		
		lblTiempo = new JLabel("00:00");
		lblTiempo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTiempo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTiempo.setBounds(679, 14, 80, 20);
		panelTitulo.add(lblTiempo);
	}
}
