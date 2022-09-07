package Interfaces_Graficas;

import javax.swing.*;

public class Formulario3 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField texto;
	private JScrollPane barra1;
	private JTextArea area;
	
	public Formulario3() {
		setLayout(null);
		
		texto=new JTextField();
		texto.setBounds(10,10,200,30);
		add(texto);
		
		area = new JTextArea();
		barra1=new JScrollPane(area);
		barra1.setBounds(10,50,400,300);
		add(barra1);
	}
	
	public static void main(String args[]) {
	
	Formulario3 ventana=new Formulario3();
	ventana.setBounds(0,0,540,400);
	ventana.setVisible(true);
	ventana.setResizable(false);
	ventana.setLocationRelativeTo(null);
	
}
}