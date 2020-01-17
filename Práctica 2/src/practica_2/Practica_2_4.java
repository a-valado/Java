package practica_2;
import java.util.Scanner;

public class Practica_2_4 {
	public void sumarArray(){ 
		int [][] arrayA = new int [3][3];
		int [][] arrayB = new int [3][3];
		int i, j, num, suma = 0;
		
		try (Scanner leer = new Scanner(System.in)){
		for (i=0; i<arrayA.length; i++) {
			for (j=0; j<arrayA[1].length; j++) {
				System.out.println("Introduzca un número de la primera matriz.");
				num = leer.nextInt();
				arrayA[i][j] = num;
			}
		}
		for (i=0; i<arrayB.length; i++) {
			for (j=0; j<arrayB[1].length; j++) {
				System.out.println("Introduzca un número de la segunda matriz.");
				num = leer.nextInt();
				arrayB[i][j] = num;
			}
		}
		for (i=0; i<arrayA.length; i++) {
			for (j=0; j<arrayA[1].length; j++) {
				suma += arrayA[i][j] + arrayB[i][j];
			}
		}
		System.out.println("La suma de las dos matrices es "+ suma);
	}
}
}