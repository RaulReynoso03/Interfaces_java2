package Interfaces_Graficas;

import javax.swing.*;

import java.awt.event.*;

public class Formulario1 extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField text1;
	private JButton boton1;
	private JLabel lable1;
	
	
	public Formulario1() {
		setLayout(null);
		lable1= new JLabel("Usuario:");
		lable1.setBounds(10,10,100,30);
		add(lable1);
		
		text1 =new JTextField("");
		text1.setBounds(120, 17, 150, 20);
		add(text1);
		
		boton1=new JButton("Aceptar");
		boton1.setBounds(100,80,100,30);
		add(boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			String texto = text1.getText();
			setTitle(texto);
		}
	}
	public static void main(String args[]) {
		Formulario1 ventana1=new Formulario1();
		ventana1.setBounds(0,0,300,150);
		ventana1.setVisible(true);
		ventana1.setResizable(false);
		ventana1.setLocationRelativeTo(null);
	}
	
}
