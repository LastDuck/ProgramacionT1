package ejercicio.interfaz;

public class CajeroBancoPichincha  implements CajeroInterfaz
{

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
		int saldoactual = monto;
		// TODO Auto-generated method stub
		monto=saldoactual;
		System.out.println("Ingrese monto a retirar:"+monto);
		
	}

	@Override
	public void validarElSaldo() {
		int Retirar = 0;
		int SaldoA = 0;
		// TODO Auto-generated method stub
		int monto = SaldoA-Retirar;
		System.out.println("Saldo insuficiente");
		
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Dinero Insuficiente");
	}

	@Override
	public void realizarLaTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("No se pudo Tranferencia ");
	}

	@Override
	public void entreagrRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Recoja su  Comprobante");
	}

}
