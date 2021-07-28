package prueba;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prueba 1
		System.out.println("\tCalculador");
		
		Scanner lector=new Scanner(System.in);
		double suma=0;
		double promedio = 0;
		int valor;
		for(int i=1;i!=0;i++) {
			System.out.print("Ingrese un numero:");
			valor=lector.nextInt();
			if(valor==0) {
				i=-1;
			}else {
				suma=suma+valor;
				promedio=suma/i;
			}
		}
	

		System.out.println("la suma es :"+suma);
		System.out.printf("El promedio es %.4f :",promedio);
		
	}

	

}
