package prueba;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prueba 2
		System.out.println("\tCalculador");
		
		Scanner lector=new Scanner(System.in);
		double sumap=0,sumai=0;
		double promedio = 0,ci=0;
		int valor;
		for(int i=1;i!=-1;i++) {
			System.out.print("Ingrese un numero:");
			valor=lector.nextInt();

			if(valor==-1) {
				i=-2;
			}else if(valor%2==0) {
				sumap=sumap+valor;
			}else {
				sumai=sumai+valor;
				ci++;
				promedio=sumai/ci;
			} 
		}
		System.out.println("la suma es :"+sumap);
		System.out.printf("El promedio es %.4f :",promedio);
	}

}
