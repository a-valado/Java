import java.util.Scanner;

public class Practica1_5 {

	public void dos_tablas() {
		Scanner lector = new Scanner(System.in);
		int i;
		int numero;
		int []numA = new int[10];
		int []numB = new int[10];
		int []numC = new int[20];
		for (i=0; i<20; i++) {
			if (i<10) {
				System.out.println("Escriba un número para la tabla A.");
				numero = lector.nextInt();
				numA[i] = numero;
			}
			if (i>=10) {
				System.out.println("Escriba un número para la tabla B.");
				numero = lector.nextInt();
				numB[i] = numero;
			}
		}
		for (i=0; i<10; i++) {
			if (i%2==0) {
				numC[i]=numA[i/2];
			}
			else {
				numC[i]=numB[i/2];
			}
		}	
	}

}
