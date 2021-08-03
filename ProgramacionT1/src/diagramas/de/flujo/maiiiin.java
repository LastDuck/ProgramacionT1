package diagramas.de.flujo;

import java.util.Scanner;

public class maiiiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector=new Scanner(System.in);
	
		///examen
		 int suma,cant,valor,promedio;
	        suma=0;
	        cant=0;
	        do {
	            System.out.print("Ingrese un numero:");
	            valor=lector.nextInt();
	            if (valor!=0) {
	                suma=suma+valor;
	                cant++;
	            
	            }
	        } while (valor!=0);
	        
	        System.out.println("la suma es:"+suma);

	        if (cant!=0) {
	            promedio=suma/cant;
	            System.out.print("El promedio de los valores ingresados es:"+promedio);
	           
	        } else {
	            System.out.print("No se ingresaron valores.");
	        }
	        
	        
	        

	}

}