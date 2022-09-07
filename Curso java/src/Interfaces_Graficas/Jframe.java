package Interfaces_Graficas;

import javax.swing.*;

public class Jframe extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Jframe() {
	
	setLayout(null);	
	}
	public static void main(String args[]){
		Jframe ventana1=new Jframe();
		ventana1.setBounds(350, 100, 400,550);
		ventana1.setVisible(true);
		ventana1.setLocationRelativeTo(null);	
		ventana1.setResizable(false);  //COMANDO PARA IMPIDIR QUE SE MODIFIQUE EL TAMAÑO DE LA VENTANA 
	}
}
