import java.util.Scanner;
public class Practica1_1 {
	public void cinco_numeros() {
		Scanner num = new Scanner(System.in);
		System.out.println("Escriba cinco números");
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		int num3 = num.nextInt();
		int num4 = num.nextInt();
		int num5 = num.nextInt();
		System.out.println("Los números que ha escrito son: "+num1+", "+num2+", "+num3+", "+num4+", "+num5);
	}

}
