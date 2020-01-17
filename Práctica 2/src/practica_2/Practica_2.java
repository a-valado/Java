package practica_2;
import java.util.Scanner;

public class Practica_2 {

	public static void main(String[] args) {
		Practica_2_2 ej2 = new Practica_2_2();
		Practica_2_3 ej3 = new Practica_2_3();
		Practica_2_4 ej4 = new Practica_2_4();
		Practica_2_5 ej5 = new Practica_2_5();
		Practica_2_6 ej6 = new Practica_2_6();
		Practica_2_7 ej7 = new Practica_2_7();
		
		try (Scanner leer = new Scanner(System.in)){
		
		
		System.out.println("Escoja una opción:");
		System.out.println("1) Crear un array de 5 x 5");
		System.out.println("2) Crear dos arrays de 4 x 4 y comprobar si son simétricos");
		System.out.println("3) Crear dos arrays de 3 x 3 y sumar su contenido");
		System.out.println("4) Crear un array de 7 x 7 con una diagonal de unos");
		System.out.println("5) Crear un array de 8 x 6 con un marco de unos");
		System.out.println("6) Crear un array personalizado con un marco de unos");
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
		case 4:
			ej5.crearDiagonal();
			break;
		case 5:
			ej6.crearMarco();
			break;
		case 6:
			ej7.crearArrayPersonalizado();
			break;
		default:
			System.out.println("Opción no válida.");
		}
		}
	}
}