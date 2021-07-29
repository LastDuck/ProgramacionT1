package prueba;

import java.util.Scanner;

public class MainDoWhite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector=new Scanner(System.in);
		
		///examen
		 int sumap=0,cant,sumai=0,valor=1,promedio=1;
	        
	        cant=0;
	        do {
	        	System.out.print("Ingrese un numero:");
				valor=lector.nextInt();
				if(valor==-1) {
					cant=-1;
				}else if(valor%2==0) {
					 sumap=sumap+valor;
				}else {
					 sumai=sumai+valor;
					cant++;
					 promedio=sumai/cant;
					
				} 
	        } while (valor!=-1);
	        
	        System.out.println("la suma es :"+sumap);
	       
			System.out.print("El promedio es :"+promedio);
	        
	}   

	}