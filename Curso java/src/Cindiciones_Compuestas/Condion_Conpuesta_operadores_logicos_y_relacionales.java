package Cindiciones_Compuestas;

import java.util.Scanner;

public class Condion_Conpuesta_operadores_logicos_y_relacionales {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		String nombre = " ";
		int clave = 0,antiguedad = 0;
		
		System.out.println("*******************************************************");
		System.out.println("*Bienvenido al sistema vacacional de coca cola company*");
		System.out.println("*******************************************************");
		System.out.println("\n");
		
		System.out.println("¿Cual es el nombre del trabajador?:");
		nombre=teclado.nextLine();
		System.out.println("\n");
		
		System.out.print("¿Cuanto tiempo de servicio tiene el trabajador?:");
		antiguedad=teclado.nextInt();
		System.out.println("\n");
		
		System.out.print("¿Cual es la clave del trabajador?:");
		clave=teclado.nextInt();
		System.out.println("\n");
		
		if (clave==1) {
			if(antiguedad==1) {
				System.out.println("El trabajador "+nombre+" tiene derecho a 6 dias de vacaciones");
			}else if(antiguedad>=2 && antiguedad<=6) {
				System.out.println("El trabajador "+nombre+" tiene derecho a 14 dias de vacaciones");
			}else if(antiguedad>=7) {
				System.out.println("El trabajador "+nombre+" tiene derecho a 20 dias de vacaciones");
			}
		}else if (clave==2) {
			if(antiguedad==1) {
				System.out.println("El trabajador "+nombre+" tiene derecho a 7 dias de vacaciones");
			}else if(antiguedad>=2 && antiguedad<=6) {
				System.out.println("El trabajador "+nombre+" tiene derecho a 15 dias de vacaciones");
			}else if(antiguedad>=7) {
				System.out.println("El trabajador "+nombre+" tiene derecho a 22 dias de vacaciones");
			}
			
		}else if (clave==3) {
			if(antiguedad==1) {
				System.out.println("El trabajador "+nombre+" tiene derecho a 10 dias de vacaciones");
			}else if(antiguedad>=2 && antiguedad<=6) {
				System.out.println("El trabajador "+nombre+" tiene derecho a 20 dias de vacaciones");
			}else if(antiguedad>=7) {
				System.out.println("El trabajador "+nombre+" tiene derecho a 30 dias de vacaciones");
			}
			
		}else {
			System.out.println("Error");
		}
	}
}
