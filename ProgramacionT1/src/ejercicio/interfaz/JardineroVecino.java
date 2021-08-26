package ejercicio.interfaz;

public class JardineroVecino implements JardineroInterfaz {

	@Override
	public void Cortar() {
		// TODO Auto-generated method stub
		System.out.println("prender la maquina");
		System.out.println("poner el cesped");
		System.out.println("Corta la primera sendero ");
		
	}

	@Override
	public void regar() {
		// TODO Auto-generated method stub
		System.out.println("conectar manguera");
		System.out.println("Abrir llave de agua");
		System.out.println("Regar a las palntas");
	}

}
