package practica_2;
import java.util.Scanner;

public class Practica_2_7 {
	public void crearArrayPersonalizado() {
		try (Scanner leer = new Scanner(System.in)){
			System.out.println("Introduzca el primer número de la matriz:");
			int ancho = leer.nextInt();
			System.out.println("Introduzca el segundo número de la matriz:");
			int profundo = leer.nextInt();
			int [][]arrayPers = new int[ancho][profundo];
			int i, j;
			for (i=0; i<ancho; i++) {
				for (j=0; j<profundo; j++) {
					if (i==0) {arrayPers[i][j] = 1;}
					else if (i == (ancho-1)) {arrayPers[i][j] = 1;}
					else if (j == 0) {arrayPers[i][j] = 1;}
					else if (j == (profundo-1)) {arrayPers[i][j] = 1;}
					else {arrayPers[i][j] = 0;}
				}
			}
			for (i=0; i<ancho; i++) {
				System.out.println();
				for (j=0; j<profundo; j++) {
				System.out.print(arrayPers[i][j]);
				}
			}
		}
		}
	}
