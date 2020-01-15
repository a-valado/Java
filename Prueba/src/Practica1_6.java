import java.util.Scanner;
public class Practica1_6 {

	public void dos_tablas_triadas() {
		Scanner lector = new Scanner(System.in);
		int [] tablaA = new int[12];
		int [] tablaB = new int[12];
		int i;
		for (i = 0; i<12; i ++) {
			System.out.println("Introduzca un número para la tabla A");
			int aux = lector.nextInt();
			tablaA[i] = aux;
			System.out.println("Introduzca un número para la tabla B");
			aux = lector.nextInt();
			tablaB[i] = aux;
		}
		int[] tablaC = new int[24];
		for (i = 0; i<24; i++) {
			
		}
		
	}
}
