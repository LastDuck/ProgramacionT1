package practicass;

import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/*Se ingresa por teclado 2 n�meros: A y B se desea mostrar la divisi�n entre 
		dichos n�meros en caso de ser posible, caso contrario indicar al usuario que la divisi�n es imposible.*/
		

		System.out.println("Ingrese los dos numeros:");
		
		Scanner lector=new Scanner(System.in);
		int num1=lector.nextInt();
		int num2=lector.nextInt();
		
		if(num2==0) {
			System.out.println("la division no es posible.");
		}else {
			int D=num1/num2;
			System.out.println("la disicion es :"+ D);
		}
		
	}

}
