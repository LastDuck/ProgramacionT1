package ordenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class metodoQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// El usuario digita la longitud del vector.
		System.out.print("Ingrese la longuitud del vector:");
		int longitud = teclado.nextInt();
		// Declaramos el Vector en un bucle
		int vectorGrupo1[] = new int[longitud];
		for (int fila = 0; fila < longitud; fila++) {
			System.out.println("El valor de la posición " + fila);// Me imprime el número de posiciones
			int numN = teclado.nextInt();
			vectorGrupo1[fila] = numN;
		}

		for (int fila = 0; fila < longitud; fila++) {
			System.out.print("[" + vectorGrupo1[fila] + "]" + " ");

		}
		System.out.println();
		for (int fila = 0; fila < longitud; fila++) {
			quicksort(vectorGrupo1, 0, vectorGrupo1.length - 1);
			System.out.print("[" + vectorGrupo1[fila] + "]" + " ");
		}
		
		System.out.println();
		System.out.println("Ordenamiento de java");
		Arrays.sort(vectorGrupo1);
		
		System.out.println("El vector despues de ordenador :"+Arrays.toString(vectorGrupo1));
	}

	private static int colocacion(int vectorGrupo1[], int izquierda, int derecha) {
		int pivote = vectorGrupo1[izquierda];
		while (true) {
			while (vectorGrupo1[izquierda] < pivote) {
				izquierda++;
			}
			while (vectorGrupo1[derecha] > pivote) {
				derecha--;
			}

			if (izquierda >= derecha) {
				return derecha;
			} else {

				int colocamiento = vectorGrupo1[izquierda];
				vectorGrupo1[izquierda] = vectorGrupo1[derecha];
				vectorGrupo1[derecha] = colocamiento;

				izquierda++;
				derecha--;
			}
		}
	}

	private static void quicksort(int vectorGrupo1[], int izquierda, int derecha) {
		if (izquierda < derecha) {
			int orden = colocacion(vectorGrupo1, izquierda, derecha);
			quicksort(vectorGrupo1, izquierda, orden);
			quicksort(vectorGrupo1, orden + 1, derecha);
		}

	}


	

}
