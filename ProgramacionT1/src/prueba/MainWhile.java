package prueba;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int suma,cant,valor=1 ,promedio = 1;
	        suma=0;
	        cant=0;
	        Scanner lector=new Scanner(System.in);
	       
	        while(valor!=0) {
	        	 System.out.print("Ingrese un numero:");
		            valor=lector.nextInt();
		            if(valor!=0) {
			        	suma=suma+valor;
						cant++;	
		            }else {
		            	cant=cant-1;
		            }
				}
	        if (cant!=0) {
            	promedio=suma/cant;
			}
		System.out.println("la suma es :"+suma);
		
		System.out.print("El promedio es  :"+promedio);
	}

}
