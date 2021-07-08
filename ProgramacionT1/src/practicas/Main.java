package practicas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println("Ingrese dos numeros:");
		
		Scanner lector =new Scanner(System.in);   //creacion de objeto scanner
		
		int num1=lector.nextInt();
		int num2=lector.nextInt();
	
		int suma=num1+num2;
		int resta=num1-num2;
		int multiplicacion=num1*num2;
	
		System.out.println("la suma es :"+suma);
		System.out.println("la resta es :"+resta);
		System.out.println("la multiplicacion es :"+multiplicacion);*/
		
		
		/*System.out.print("Ingrese el un numero:");
		Scanner lector =new Scanner(System.in);   //creacion de objeto scanner
		
		int num1=lector.nextInt();
		
		if(num1==1) {
			System.out.println("numero Correcto:");
		}else {
			System.out.println("numero Incorrecto");
			System.out.println("El numero :"+num1);

		}*/
		
		System.out.print("Ingrese el valor del sueldo:");
		Scanner lector =new Scanner(System.in);   //creacion de objeto scanner
		
		int v1=lector.nextInt();
	
		if(v1<300) {
			System.out.println("Su bonificacion es de : 50");
		}else {
			System.out.println("Su bonificacion es de : 0");
		}
	}

}
