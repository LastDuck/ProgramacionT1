package ejercicio.modificador.acceso.enfermera;

import ejercico.modificadores.acceso.PacienteTerceraEdad;

public class Enfermera {

	public void darDeAlta() {
		PacienteTerceraEdad juan=new PacienteTerceraEdad();
		juan.exaamenProstata();
		juan.nombre="";
		juan.apellido="";
		//juan.realizarDiagnostico();
	}
	
}

