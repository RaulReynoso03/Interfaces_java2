package Ciclos_O_Bucles;

public class Ejercicios_Bucles {

	public static void main(String[] args) {
		
		System.out.println("Estructura for");
		for (int i = 0; i <=10;i++) {
			if(i<10) {
				System.out.println(i+",");
			}else {
				System.out.println(i);
			}
		}
		System.out.println("Estructura while");
		int k=1;	
		System.out.println("");
		while (k<=10) {
			if(k<10) {
				System.out.println(k+",");
			}else {
				System.out.println(k);
			}
			k++;
		}
		System.out.println("Estructura do while");
		int j=1;	
		System.out.println("");
		do {
			if (j<10) {
				System.out.println(j+",");
			}else {
				System.out.println(j);
			}
			j++;
		}while (j<=10);
	}

}
