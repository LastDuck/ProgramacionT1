package correcion.prueba.uno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector =new Scanner (System.in); 
		System.out.println("Ingrese informacion del pasajero");
		System.out.print("Ingrese nombre: ");
		String nombre=lector.nextLine().toUpperCase();
		System.out.print("Ingrese apellido: ");
		String apellido=lector.nextLine().toUpperCase();
		System.out.println("Ingrese edad");
		int edad=lector.nextInt();
		System.out.println("Que tipo de pasajero es :"+"\n1.-Pasajero Vip"+"\n2.-Pasajero Eco");
		int opcion=lector.nextInt();
		
		String menbresia="";
		String decuento="";
		if(opcion==1) {
			lector.nextLine();
			System.out.println("Ingrese Codigo de menbresia:");
			menbresia=lector.nextLine().toUpperCase();
		}else {
			lector.nextLine();
			System.out.println("Ingrese Codigo de decuento:");
			decuento=lector.nextLine().toUpperCase();
		}
		
		
		
		PasajeroVip PV1=new PasajeroVip("Javier","Cruz","fksnamfn",25);
		
		PasajeroEconomico PE1 =new PasajeroEconomico();
		PE1.setNombre(nombre);
		PE1.setApellido(apellido);
		PE1.setCodigoDescuento(decuento);
		PE1.setEdad(edad);
		
		Pasajero[][] asientos=new Pasajero[4][5];
		asientos[0][0]=PV1;
		asientos[3][0]=PE1;
		
		int opcion1;
		do {
		System.out.println("Ingrese datos del asiento del pasajero");
		System.out.println("Ingrese fila del asiento :");
		int fila=lector.nextInt();
		System.out.println("Ingrese columna del asiento:");
		int columna=lector.nextInt();
		
		System.out.println("\t<<Datos del Pasajero>>");
		System.out.println(asientos[fila][columna]);
		
		System.out.println("1.-Buscar"+"\n2.-Salir");
		 opcion1 =lector.nextInt();
		}while(opcion1!=2);
		
	}

}
