package deber.vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.Declara un vector X(8)
		int[] X=new int[8];
//		2.Declarar un vector Y(3) de tipo char y asignar a la posición 2 el valor de A

		char[] Y=new char[3];
		Y[2]='A';
//		3.Declarar un vector A(5) asignar a la posición 0 el valor 25, posición 3 el valor 49 y a la posición 2 el valor de la posición 0
		int[] A=new int[5];
		A[0]=25;
		A[3]=49;
		A[2]=A[0];
//		4.Declarar un vector B(10), a la posición B[0] asignele el valor del vecto A[3] del ejercicio anterior
		int[] B=new int[10];
		B[0]=A[3];
//		5.Declara un vector Z(12) y asignar a todas sus posiciones valores que inician desde 1 y son secuenciales
		int[] Z=new int[12];
		for(int i=0;i<12;i++) {
			
			Z[i]=i;
			System.out.println("la posicion :"+ i);
		}
//		6.Declara un vector Y(10) y asignar a todas sus posiciones valores impares que inician desde 1 y son secuenciales
		int[] y=new int[10];
	for(int i=0;i<10;i++) {
		
		  if(i % 2 == 0){

              System.out.println(i);
              y[i]=i;

              }
		
		}
//		7.Declara un vector H(10) y asignar solo a las posiciones impares letras que inician desde la A secuencialmente
	int[] H=new int[10];
	for(int i=0;i<10;i++) {
		
		  if(i % 2 == 0){

            
            }else {
            	
            	System.out.println(i);
                y[i]=i;

            }
		
		}
	
	
//		8.Declarar un vector F(10) y en base al ejercicio anterior asignar los valores de la siguiente manera:
//		F[0]=H[3]
//		F[3]=H[2]
//		F[4]=H[6]
//		F[7]=H[0]
//		F[8]=H[1]
//		F[9]=H[9]
//
//		9. Declara un vector L(15) y asignar valores en base a los siguiente:

//		L[0]= (promedio de 3,5,7 y 9)
//		L[4]= (la suma de 5, 7, 8 y 15)
//		L[7]= (la multiplicación de 6, 7 y 3)
//		L[10]= (la división de 10/2)
	int[] L=new int[15];
	int promedio=(3+5+7+9)/4;
	int suma =5+7+8+15;
	int multiplicacion=6*7*3;
	int division=10/2;
	L[0]=promedio;
	L[4]=suma;
	L[7]=multiplicacion;
	L[10]=division;
	
//
//		10. Declarar un vector N(12) y realizar las siguientes asignaciones:

//		N[0]= (promedio de 3,10 y 9)
//		N[4]= (la suma de 7, 8 y 10)
//		N[12]= (la multiplicación de 5, 7 y 3)
//		N[20]= (la suma de 7, -3 y 8)
//		en la última posición el valor de 20/4
	int[] N=new int[12];
	int promedio1=(3+10+9)/3;
	int suma1 =7+8+10;
	int multiplicacion1=5*7*3;
	int suma2=7-3+8;
	int division1=10/2;
	N[0]=promedio1;
	N[4]=suma1;
	N[12]=multiplicacion1;     //nos da uneeror xq no existe el rango del vectorN[12]
	N[20]=suma2;              //nos da uneeror xq no existe el rango del vectorN[20]
	N[11]=division1;
	
	}

}
