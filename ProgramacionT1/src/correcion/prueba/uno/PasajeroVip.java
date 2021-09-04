package correcion.prueba.uno;

public class PasajeroVip extends Pasajero {

	private String codigoMembresia;
	
	public PasajeroVip(String nombre,String apellido,String codigoMembresia, int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.codigoMembresia=codigoMembresia;
	}

	@Override
	public String toString() {
		return "PasajeroVip "+"\ncodigoMembresia=" + codigoMembresia + "\nNombre:" + getNombre() + "\nApellido:"
				+ getApellido() + "\nEdad:" + getEdad() ;
	}

	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}
}
