package ejercicios.varios.vectores.matricez;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare un vector x[3] de tipon char y construya un programa q pida al usiario
		//que ingrese los valores de cada posicion
	
		
		Scanner lector=new Scanner(System.in);
		char[] X=new char[3];
		
		 
			
		for(char i=0;i<3;i++) {
			System.out.println("Ingrse el valor de la posicion :"+ i);
			char n=lector.next().charAt(0);
			
		X[i]=n;
			
		}//recorrido el vector lleno
		for(char i=0;i<3;i++) {
			System.out.println("el valor de la posicion :"+ i);
			System.out.println(X[i]);
		}
	}

}
