package Interfaces_Graficas;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton2 extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton boton1,boton2,boton3;
	
	private JLabel label1;
	
	public Boton2() {
		setLayout(null);
		boton1=new JButton("1");
		boton1.setBounds(10,100,90,30);
		add(boton1);
		boton1.addActionListener(this);//Linea para agregar un evento;
		
		boton2=new JButton("2");
		boton2.setBounds(108,100,90,30);
		add(boton2);
		boton2.addActionListener(this);
		
		boton3=new JButton("3");
		boton3.setBounds(203,100,90,30);
		add(boton3);
		boton3.addActionListener(this);
		
		label1 = new JLabel("En espera...");
		label1.setBounds(10,10,300,30);
		add(label1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== boton1) {
			label1.setText("Has precionado el boton 1");
		}if(e.getSource()==boton2) {
			label1.setText("Has precionado el boton 2");
		}if(e.getSource()== boton3) {
			label1.setText("Has precionado el boton 3");
		}
	}
	public static void main(String args[]) {
		
		Boton2 b=new Boton2();
		b.setBounds(0,0,315,220);
		b.setVisible(true);
		b.setResizable(false);
		b.setLocationRelativeTo(null);
	}
	}