package deber.modificadores.accesoo;

public class Persona {
	
	/*PUBLIC: Este nivel de acceso permite a acceder al elemento desde cualquier clase, independientemente de que esta
	pertenezca o no al paquete en que se encuentra el elemento*/
	
	public String nombre;
	public String apellido;
	
	//Default :s�lo puede ser accedido por clases que est�n en el mismo paquete
	
	int edad;
	
	/*PRIVATE: Este es el modificador m�s restrictivo y especifica que los elementos que lo utilizan s�lo
	pueden ser accedidos desde la misma clase en la que se encuentran*/
	
	private String cedula;
	
	/*PROTECTED: Indica que los elementos s�lo pueden ser accedidos desde su mismo paquete y desde
	cualquier clase que extienda la clase en que se encuentra*/
	
	protected String direccion;
	
	protected void DirrecionVivienda() {
		
	}
	
}
