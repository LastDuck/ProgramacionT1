package practicass;

import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Se ingresa por teclado 2 números: A y B se desea saber si A es múltiplo de B, 
		imprimir en pantalla los textos correspondientes para cada caso.*/
		
		System.out.println("Ingrese los dos numeros:");
		
		Scanner lector=new Scanner(System.in);
		int num1=lector.nextInt();
		int num2=lector.nextInt();
		
		int R=num1%num2;
		
		if(R==0) {
			System.out.println("Es Multiplo");
		}else {
			System.out.println("No Es Multiplo");
		}
	}

}
