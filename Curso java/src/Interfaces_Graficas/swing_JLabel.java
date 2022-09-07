package Interfaces_Graficas;

import javax.swing.*;

public class swing_JLabel extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1;
	private JLabel label2;
	
	public swing_JLabel() {
	//CREAR INTERFAZ UNO
	setLayout(null);	
	label1=new JLabel("Hola mundo de las interfacez graficas");
	label1.setBounds(10,20,300,30);
	add(label1);
	//CREAR INTERFAZ DOS
	label2=new JLabel("vercion 1.0 :D");
	label2.setBounds(10,100,100,30);
	add(label2);
	}
	
	public static void main(String args[]) {
		swing_JLabel ventana=new swing_JLabel();
		ventana.setBounds(0,0,300,200);
		ventana.setResizable(false);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);//INDICAR QUE SE MUESTRE EN EL CENTRO DE LA PANTALLA
		
	}
	
}
