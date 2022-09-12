package Cerrar_Ventana;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana1 extends JFrame {

	public Ventana1() {
		
		//this.setSize(300,300);
		
		setTitle("Titulo");//PONER UN TITULO A LA VENTANA
		
		//setLocation(100, 200);//ESTABLECER LA POCION DE LA VENTANA
		
		setBounds(100, 200, 500,500);//INGRESAR EL TAMAÑO Y POCICION SIN USAR SIVE O LOCATION
		
		setLocationRelativeTo(null);//ESTABLECER LA PANTALLA EN EL CENTRO
		
		iniciarComponentes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//CERRAR EL PROGRAMA 
	
	}
	//CREACION DE UN PANEL 
	private void iniciarComponentes() {
		JPanel panel = new JPanel();//CREACION DE UN PANEL
		panel.setLayout(null);//DESACTIVAR EL DISEÑO
		panel.setBackground(Color.green);//ESTABLECEMOS EL COLOR DEL PANEL
		this.getContentPane().add(panel);//AGREGAMOS EL PANEL A LA VENTANA
		
		JLabel etiqueta = new JLabel("Hola");//CREAMOS UNA ETIQUETA//ESTABLECEMOS EL EN QUE POCION VA A ESTAR NUESTRA ETIQUETA
		//etiqueta.setText("Hola");//ESTABLECEMOS LA ETIQUETA 
		etiqueta.setBounds(10, 10, 50, 20);//ESBLECER EL TAMAÑO Y CORDENADAS DE LA ETIQUETA	
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setForeground(Color.BLACK);//ESBLECEMOS EL COLOR DE LA LETRA DE LA ETIQUETA
		etiqueta.setOpaque(true);//ESTABLECEMOS PERMISOS PARA PINTAR LA ETIQUETA
		etiqueta.setBackground(Color.WHITE);//ESTABLECEMOS EL COLOR DE LA ETIQUETA
		panel.add(etiqueta);//AGREGAMOS LA ETIQUETA AL PANEL
		
	}
	
}
