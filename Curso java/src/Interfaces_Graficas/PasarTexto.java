package Interfaces_Graficas;

import javax.swing.*;
import java.awt.event.*;

public class PasarTexto extends JFrame implements ActionListener {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JTextField Campo_1;
 private JScrollPane Scroll_1;
 private JTextArea Area_1;
 private JButton Pulsador_1, Pulsador_2;

 String Texto_1 = "";
 
// Constructor
 public PasarTexto (){
  setLayout (null);
  Campo_1 = new JTextField ();
  Campo_1.setBounds (10,10,200,30);
  add (Campo_1);

  Pulsador_1 = new JButton ("Agregar");
  Pulsador_1.setBounds (250,10,100,30);
  add (Pulsador_1);
  Pulsador_1.addActionListener (this);

  Pulsador_2 = new JButton ("Salir");
  Pulsador_2.setBounds (370,10,100,30);
  add (Pulsador_2);
  Pulsador_2.addActionListener (this);

  Area_1 = new JTextArea ();
  Scroll_1 = new JScrollPane (Area_1);
  Scroll_1.setBounds (10,50,400,300);
  add (Scroll_1);

  setTitle ("Pasando texto del Campo de Texto al Área de Texto");
 }

  public void actionPerformed (ActionEvent P_1) {

  if (P_1.getSource() == Pulsador_1) {
   Texto_1 += Campo_1.getText() + "\n";  
   Area_1.setText (Texto_1);
   Campo_1.setText ("");
  }

  if(P_1.getSource () == Pulsador_2) {
   System.exit (0);
   
  }
 }

  //CREANDO LA INTERFAZ GRAFICA 
 public static void main (String args []) {
  PasarTexto Formulario = new PasarTexto ();
  Formulario.setBounds (0,0,540,400);
  Formulario.setVisible (true);
  Formulario.setResizable (false);
  Formulario.setLocationRelativeTo (null);


 }
}
