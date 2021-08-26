package ejercicio.interfaz;

public interface CajeroInterfaz {

	public void ingresarTargeta(String numeroTar);
	public void solicitarClave(String clave);
	public void solicitarTipoTransferencia();
	public void solicitarMonto(int monto);
	public void validarElSaldo();
	public void entregarDinero();
	public void realizarLaTransaccion();
	public void entreagrRecibo();
}
