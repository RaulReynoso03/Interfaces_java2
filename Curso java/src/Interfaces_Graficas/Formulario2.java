package Interfaces_Graficas;

import javax.swing.*;

public class Formulario2 extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField texto;
	private JTextArea area;
	
	public Formulario2() {
		setLayout(null);
		texto=new JTextField();
		texto.setBounds(10,10,200,30);
		add(texto);
		
		area=new JTextArea();
		area.setBounds(10,50,400,300);
		add(area);
	}
	public static void main(String args[]) {
		Formulario2 ventana=new Formulario2();
		ventana.setBounds(0,0,540,400);
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
	}
	
}
