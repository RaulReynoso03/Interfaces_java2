package Condicionales;

public class condiconaless_if_else {

	public static void main(String[] args) {
		
		int matematicas=5;
		int biologia=8;
		int quimica=7;
		int promedio=0;
		
		promedio=(matematicas+biologia+quimica)/3;
		
		System.out.println("El promedio es de:"+promedio);
		
		if (promedio>=6) {
			System.out.println("Usted esta aprobado");
		}else if (promedio<6) {
			System.out.println("Usted no a aprobado");
		}
		
	}

}
