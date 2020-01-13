import java.util.Scanner;

public class Practica1_4 {

	public void orden_salteado() {
		Scanner lector = new Scanner(System.in);
		int i;
		int numero;
		int [] num = new int[10];
		for (i=0; i<10; i++) {
			System.out.println("Escriba un número");
			numero = lector.nextInt();
			num[i] = numero;
		}
		System.out.println("Los números que ha escrito son: "+num[0]+", "+
		num[9]+", "+num[1]+", "+num[8]+", "+num[2]+", "+num[7]+", "+num[3]+
		", "+num[6]+", "+num[4]+", "+num[5]);

	}

}
