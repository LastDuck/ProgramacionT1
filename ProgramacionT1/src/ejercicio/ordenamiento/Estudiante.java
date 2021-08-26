package ejercicio.ordenamiento;

public class Estudiante  implements Comparable<Estudiante>{

	private String nombre;
	private int numeroLista;
	private String apellido;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroLista() {
		return numeroLista;
	}
	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}
	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		//3 posibles retornos:0,-1,1
		if(this.edad>o.getEdad()) {
			return 1;
		}else if(this.edad==o.getEdad()) {
			return 0;
		}else {
			return -1;
		}
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "\n"+ "Estudiante nombre=" + nombre + " numeroLista=" + numeroLista + " apellido=" + apellido + "  edad=" + edad ;
		
	}
	
	
}
