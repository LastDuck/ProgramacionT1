package ejercicio.matriz;

import java.util.Scanner;

public class MainMatriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//desarrolar un programa que imprima la siguiente imagen
	
		char A[][]=new char [4][4];
		Scanner lector=new Scanner(System.in);
		System.out.println();
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
			
				if(i==j) {
					System.out.print("\t 1");
					A[i][j]=1;
				}else {
					System.out.print("\t 0");
					A[i][j]=0;
				}
			}
			System.out.println();
		}
		
		System.out.println();

	}


	}
