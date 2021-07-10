package diagramas.de.flujo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese el numeo:");
		Scanner lector=new Scanner(System.in);
		
		int N=lector.nextInt();
		for(int i=N+1;i<=N+5;i++) {
			System.out.println(i);
		}
		
	}

}
