package Condicionales;

public class Condicionales_if_else {

	public static void main(String[] args) {
		
		int operacion = 1;
		int num_uno=8;
		int numero_dos=4;
		int resultado = 0;
		
		if (operacion ==1) {
			resultado =num_uno+numero_dos;
			System.out.println("El resultado de la suma es " + resultado);
		}else if (operacion==2 ) {
			resultado=num_uno-numero_dos;
			System.out.println("El resultado de la resta es " + resultado);
		}else if (operacion==3) {
			resultado=num_uno*numero_dos;
			System.out.println("El resultado de la multiplicacion es " + resultado);
		}else if (operacion==4) {
			resultado=num_uno/numero_dos;
			System.out.println("El resultado de la divicacion es " + resultado);
		}else {
			System.out.println("La opcion que elegiste no existe");
		}

	}

}
