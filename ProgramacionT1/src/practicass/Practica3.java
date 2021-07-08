package practicass;

import java.util.Scanner;

public class Practica3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Se ingresa por teclado el sueldo de un empleado y se desea pagar
		una bonificación de acuerdo con la siguiente tabla*/
		
		System.out.println("Ingrese el sueldo del empleado:");
		
		Scanner lector=new Scanner(System.in);
		int S=lector.nextInt();
		
		if(S<=300) {
			int b=100;
			int T=S+b;
			System.out.println("Su sueldo total es de :"+ T);
		} else if (S>300  && S<=400) {
			int b=70;
			int T=S+b;
			System.out.println("Su sueldo total es de :"+ T);
		}else if(S>400) {
			int b=50;
			int T=S+b;
			System.out.println("Su sueldo total es de :"+ T);	
		}
		
	}

}
