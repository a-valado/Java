import java.util.Scanner;

public class Practica1_2 {
	public void orden_inverso() {
		System.out.println("Escriba cinco números");
		Scanner lector = new Scanner(System.in);
		int num1 = lector.nextInt();
		int num2 = lector.nextInt();
		int num3 = lector.nextInt();
		int num4 = lector.nextInt();
		int num5 = lector.nextInt();
		System.out.println("Los números que ha escrito son: "+num5+", "+num4+", "+num3+", "+num2+", "+num1);
	}
}


