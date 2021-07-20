package calendario;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int AñoA = 2000, AñoN;
		int MesA = 2, MesN, mes = 0;
		int diaA = 5, diaN, dia = 0;
		int edad = 0;
		int dias_mes_actual = 0;
		int diaR=0;

		Scanner lector = new Scanner(System.in);
		System.out.printf("fecha actual: %d/%d/%d ", AñoA, MesA, diaA);
		System.out.println();
		System.out.print("año Nacimiento:");
		AñoN = lector.nextInt();
		System.out.print("mes Nacimiento:");
		MesN = lector.nextInt();
		System.out.print("dia Nacimiento:");
		diaN = lector.nextInt();

		System.out.printf("fecha Nacimiento: %d/%d/%d ", AñoN, MesN, diaN);
		System.out.println();

		edad = AñoA - AñoN; /// cuantos años a cumplido formula//edad

		if(AñoA==AñoN) {
			edad=edad;
		} else if (MesN > MesA) { // comprobar edad es verdadero
			edad = edad - 1;
		} else if (MesN == MesA) {
			if (diaN > diaA) {
				edad = edad - 1;
			} else {
				edad = edad;
			}
		}

		
		int dias_mes_nacimiento=0 ,dias_mes_nacimiento1=0,dias_mes_nacimiento2=0;
		if ((MesN == 2 || MesA==2 ) || AñoN % 4 == 0) { // bisisesto
			dias_mes_nacimiento = 29;
		} else if ((MesN == 2 || MesA==2 ) || AñoN % 4 != 0) { // normal
			dias_mes_nacimiento = 28;
		} if ((MesN == 1 || MesN == 3 || MesN == 5 || MesN == 7 || MesN == 8 || MesN == 10 || MesN == 12) || (MesA == 1 || MesA == 3 || MesA == 5 || MesA == 7 || MesA == 8 || MesA == 10 || MesA == 12)) {
			dias_mes_nacimiento1 = 31;
		} if ((MesN == 4 || MesN == 6 || MesN == 9 || MesN == 11) || (MesA == 4 || MesA == 6 || MesA == 9 || MesA == 11)) { // los meses que tiene 31 dias
			dias_mes_nacimiento2 = 30;
		} 
		
	}

}
