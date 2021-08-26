package ejercicio.interfaz;

public class CajeroProduBanco implements CajeroInterfaz {

	@Override
	public void ingresarTargeta(String numeroTar) {
		// TODO Auto-generated method stub
		System.out.println("ingrese n tarjeta:"+numeroTar);
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese contraseña:"+clave);
	}

	@Override
	public void solicitarTipoTransferencia() {
		// TODO Auto-generated method stub
		System.out.println("tipo de tranferencias:Cuenta corrriente");
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese monto a retirar:"+monto);
		
	}

	@Override
	public void validarElSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Saldo comfinardo");
		
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Retire su dinero");
	}

	@Override
	public void realizarLaTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("la Tranferencia se rializo con exito");
	}

	@Override
	public void entreagrRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Recoja su  Comprobante");
	}

}
