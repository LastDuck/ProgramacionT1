package deber.modificadores.accesoo;

public class bibliotecario extends Persona {

	public void RegistrarDatos() {
		//public visible para todo esten o no en el paquete creado
		System.out.println(nombre);
		System.out.println(apellido);
		//Default:visible para todos los que esten en el paquete
		System.out.println(edad);
		//PROTECTED:visible para la clase y subclase
		System.out.println(direccion);
		//private solo visible para la clase donde se declaro  
	//	System.out.println(cedula);
	}
	public void AccesarADocumentacion() {
	
	}
	
	protected void CrearLibro() {
		
	}
}