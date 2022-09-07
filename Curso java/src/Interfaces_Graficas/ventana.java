package Interfaces_Graficas;

import javax.swing.*;

public class ventana extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1;
	
	public ventana() {
		
	setLayout(null);
	label1=new JLabel("Me llamo Raul");
	label1.setBounds(100,40,200,300);
	add(label1);
	
	}
	
	public static void main(String args[]) {
	
		ventana ventana1 = new ventana();
		ventana1.setBounds(0,0,400,300);
		ventana1.setVisible(true);
		ventana1.setLocationRelativeTo(null);	
	}
}