package ejercicios.varios.vectores.matricez;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declare un vector x cuya longuitud se solicite al usuario de tipo int y construya un programa q pida al usiario
				//que ingrese los valores de cada posicion
		int N=0;
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingrse la longuitud del vector :");

	 N=lector.nextInt();

		int[] X=new int[N];
		
		 for(int i=0;i<N;i++) {
			System.out.println("Ingrse el valor de la posicion :"+ i);
			 int n=lector.nextInt();
			X[i]=n;
			
		}//recorrido el vector lleno
		for(char i=0;i<N;i++) {
			System.out.println("el valor de la posicion :"+ i);
			System.out.println(X[i]);
		}
	



	}

}
