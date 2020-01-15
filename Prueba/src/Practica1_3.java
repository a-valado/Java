import java.util.Scanner;

public class Practica1_3 {
	public void medias() {
		Scanner lector = new Scanner(System.in);
		int i;
		int num;
		int cantpositivos = 0;
		int cantnegativos = 0;
		int cantceros = 0;
		int mediapos = 0;
		int medianeg =0;
		int[] positivos = new int[5];
		int[] negativos = new int[5];
		int[] ceros = new int[5];
		for (i=0; i<5; i++) {
			System.out.println("Escriba un número");
			num = lector.nextInt();
			if (num>0) {
				positivos[i] = num;
			}
			else if (num<0) {
				negativos[i] = num;
			}
			else if (i==0) {
				ceros[i] = 1;
			}
		}
		for (i=0; i<5; i++) { 
			if (positivos[i] != 0) {
				cantpositivos ++;
				mediapos += positivos[i];
			}
			if (negativos[i] != 0) {
				cantnegativos ++;
				medianeg += negativos[i];
			}
			if (ceros[i] != 0) {
				cantceros ++;
			}
		}
		System.out.println("La media de los positivos es "+ (mediapos/cantpositivos) +
				", la media de negativos es "+ (medianeg/cantnegativos) + "y hay "+ cantceros +
				"ceros");
	}
}