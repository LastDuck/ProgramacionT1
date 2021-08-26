package bibliotecaa;
import deber.modificadores.accesoo.*;
public class biblioteca {

	public void ContratarPersonal() {
		bibliotecario B1=new bibliotecario();
		B1.nombre="";
		B1.apellido="";
		B1.AccesarADocumentacion();
		B1.RegistrarDatos();
		//B1.DirrecionVivienda();  //no puede acceder ya que esta protegio y solo sirve el las clase y subclase no mas en un paquete  distinto 
	   
	}
}
