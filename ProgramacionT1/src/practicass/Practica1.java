package practicass;

import java.util.Scanner;

public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/*Se ingresa por teclado 2 números: A y B se desea mostrar la división entre 
		dichos números en caso de ser posible, caso contrario indicar al usuario que la división es imposible.*/
		

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
