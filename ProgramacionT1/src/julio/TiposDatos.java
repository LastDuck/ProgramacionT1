package julio;

import java.util.Scanner;

public class TiposDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//numerico
	/*	short cantidadEstudiante=1000;
		byte entradaCircuito=0;
		int cantCiudadanos=10000;
		long cantMundo=1000000000;
		float sueldo= 156.58f;
		double saldoBanco=547815421.256;
		
		//logico
		boolean casado=true;
		
		//caracter
		char opcionMenu='a';*/
		
		Scanner lector=new Scanner(System.in);
		
		
		System.out.print("ingrese un numero:");
		int n=lector.nextInt();
		int i = 1,m;
	
		
		/*do{
			m=i*2;
			System.out.println(m);
			i++;
		}while(i<=n);  */ 
		
		
		/*do {
			
		
			m=2*i-1;
			if(m==7 || m==17 || m==27) {
				System.out.println("*"+m);
			}
			else{
				System.out.println(m);
			}
			i++;
		
			
		}while(i<=n);*/

	/*	while(n<=0) {
			System.out.println(">> numero incorrecto");
			System.out.print("Ingrese un numero:");
			n=lector.nextInt();
		}
		if(n%2==0) {
			System.out.println("El numero es par: " +n);
		}else {
			System.out.println("el munero es impar :" +n);
		}*/
		

		while(n<=0 || n>10) {
			System.out.println(">> numero incorrecto");
			System.out.print("Ingrese un numero:");
			n=lector.nextInt();
		}
		
		System.out.println(">> numero correcto");
		
	}
	

}
