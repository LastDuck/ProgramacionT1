package correcion.prueba.uno;

public class PasajeroEconomico  extends Pasajero {

	private String codigoDescuento;

	@Override
	public String toString() {
		return "PasajeroEconomico"+"\ncodigoDescuento:" + codigoDescuento + "\nNombre:" + getNombre()
				+ "\nApellido:" + getApellido() + "\nEdad:" + getEdad() ;
	}

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}
}
