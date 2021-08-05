package ejercicio.matriz;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector=new Scanner(System.in);
		System.out.printf("Ingrese el numero de filas: ");
		int filas=lector.nextInt();
		System.out.printf("Ingrese el numero de columnas: ");
		int columnas=lector.nextInt();
		char A[][]=new char [filas][columnas];
		
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.printf("Ingrse el valor de la posicion [%d][%d]:", i,j);
				char n=lector.next().charAt(0);
				A[i][j]=n;
			}
			
		}
		
		System.out.println("\t------------------------------");
		
		for(int i = 0; i < A.length; i++){ 
			for(int j = 0; j < A[i].length; j++){ 
				System.out.print(A[i][j]+" ");	// Imprime elemento 
			} 
			System.out.println();	// Imprime salto de línea 
		} 
	}

}
