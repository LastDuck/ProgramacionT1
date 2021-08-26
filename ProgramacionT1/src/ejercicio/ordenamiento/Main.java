package ejercicio.ordenamiento;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		danilo.setEdad(22);
		danilo.setApellido("Alvarracin");
		
		Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setNumeroLista(2);
		andres.setEdad(21);
		andres.setApellido("Asintiba");
		
		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);
		alex.setEdad(23);
		alex.setApellido("Pachcama");
		
		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);
		stefany.setEdad(19);
		stefany.setApellido("Flores");
		
		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setNumeroLista(21);
		jhonny.setEdad(18);
		jhonny.setApellido("Minabanda");
		

		Estudiante listaEstudiantes[] = new Estudiante[5];
		listaEstudiantes[0] = danilo;
		listaEstudiantes[1] = andres;
		listaEstudiantes[2] = alex;
		listaEstudiantes[3] = stefany;
		listaEstudiantes[4] = jhonny;
		//Vector antes de ordenar
		
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));
		//Aqui ordeno la lista
		
		Arrays.sort(listaEstudiantes);
		
		System.out.println();
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));
	}

}
