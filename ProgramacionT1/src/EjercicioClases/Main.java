package EjercicioClases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector =new Scanner(System.in);
		System.out.println("Ingresa la cantidad de líneas para el triángulo:");
		int linea=lector.nextInt();
		
		
		
		for(int fila=1;fila<=linea;fila++) {
			
	
		for (int ast = linea; ast >= fila; ast--) {
			System.out.print("*");
		}
		 System.out.println();
		}
	}

}
