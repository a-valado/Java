package practica_2;
import java.util.Scanner;

public class Practica_2_3 {
	public void crearArray4x4() {
		Scanner leer = new Scanner(System.in);
		int [][] array4x4 = new int [4][4];
		int i, j, num;
		boolean validar = true;
		for (i = 0; i < array4x4.length; i ++) {
			for (j=0; j < array4x4[1].length; j++) {
				System.out.println("Introduzca un número");
				num = leer.nextInt();
				array4x4[i][j] = num;
			}
		}
		for (i = 0; i < array4x4.length; i ++) {
			for (j=0; j < array4x4[1].length; j++) {
				if (array4x4[i][j] != array4x4[j][i]) {
					validar = false;
				}
			}
		}
		if (validar == true) {
			System.out.println("Las tablas son simétricas.");
		}
		else {
			System.out.println("Las tablas no son simétricas.");
		}
	}
}
