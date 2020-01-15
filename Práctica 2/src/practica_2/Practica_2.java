package practica_2;
import java.util.Scanner;

public class Practica_2 {

	public static void main(String[] args) {
		Practica_2_2 ej2 = new Practica_2_2();
		Practica_2_3 ej3 = new Practica_2_3();
		Practica_2_4 ej4 = new Practica_2_4();
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Escoja una opción:");
		int opcion = leer.nextInt();
		switch(opcion) {
		case 1: 
			ej2.crearArray5x5();
			break;
		case 2:
			ej3.crearArray4x4();
			break;
		case 3:
			ej4.sumarArray();
			break;
		}

	}
	

}
