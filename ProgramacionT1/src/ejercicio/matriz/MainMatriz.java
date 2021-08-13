package ejercicio.matriz;

import java.util.Scanner;

public class MainMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.declare una matrizA[3,4], y desarrolle un programa que vaya solicitando
		//cada uno de sus posciciones
		
		char A[][]=new char [3][4];
		Scanner lector=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("Ingrse el valor de la posicion [%d][%d]:", i,j);
				char n=lector.next().charAt(0);
				A[i][j]=n;
			}
			
		}
		
		System.out.println();
		for(int i = 0; i < A.length; i++){ 
			for(int j = 0; j < A[i].length; j++){ 
				System.out.print("\t"+A[i][j] + " ");	// Imprime elemento 
			} 
			System.out.println();	// Imprime salto de línea 
		} 
	}

}
