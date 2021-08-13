package ejercicio.vectores;

public class MainVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.declarar un vector de [10] de tipo int 
		
		int MiVector[]=new int [10];
		
		//2.declarar un vector miVector1 [5] de tipo char 
		
		char miVector1[]=new char [5];
		
		
		//3.declarar un vector miVec [4] de tipo char , y asignamos la letra A a la posicion 0 y 2
		
		char miVec[]=new char [4];
		miVec[0]='A';
		miVec[2]='A';
		
		//4 .declarar un vector miVec1 [4] de tipo byte , y asignamos la letra 0 a la posicion 0 ,1 ,2 y 3
		
				byte miVec1[]=new byte [3];
				miVec1[0]=0;
				miVec1[1]=0;
				miVec1[2]=0;
				//  miVec1[3]=0; Esta es una mala asignacion porque esta fuera de rango de la posicion 3.
				
	
     	//5 .declarar un vector miVec2[4] de tipo char , y asignamos la letra A a la posicion 0 ,1 .
				
				char miVec2[]=new char [3];
				miVec2[0]='A';
				miVec2[1]='A';
				miVec2[2]='B';
				
			System.out.println("Impresion1 : "+miVec2[0]);
			miVec2[0]='Z';
			System.out.println("Impresion2 : "+miVec2[0]);
			//System.out.print(miVec2);  imprime toda el vector
	}

}
