import java.util.Scanner;

public class Practica1_2 {
	public void orden_inverso() {
		System.out.println("Escriba cinco n�meros");
		Scanner lector = new Scanner(System.in);
		int num1 = lector.nextInt();
		int num2 = lector.nextInt();
		int num3 = lector.nextInt();
		int num4 = lector.nextInt();
		int num5 = lector.nextInt();
		System.out.println("Los n�meros que ha escrito son: "+num5+", "+num4+", "+num3+", "+num2+", "+num1);
	}
}


