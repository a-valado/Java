import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Escoja una opción:");
		int opcion = leer.nextInt();
		switch (opcion) {
		case 1:
			int num1= 10;
			int num2= 5;
			System.out.println("La suma: "+(num1+num2));
			System.out.println("La resta: "+(num1-num2));
			System.out.println("La multiplicación: "+(num1*num2));
			System.out.println("La división: "+(num1/num2));
			System.out.println("El resto: "+(num1%num2));
			break;
		case 2:
			int num3= 10;
			int num4= 5;
			if (num3>num4) {
				System.out.println(num3 + " es el mayor.");
			}
			else if (num3<num4) {
				System.out.println(num4 + "es el mayor.");
			}
			else {
				System.out.println("Son iguales.");
			}
			break;
		case 3:
			String minombre = "Albert";
			System.out.println("Bienvenido, " + minombre);
			break;
		case 4:
			String introducir_nombre = JOptionPane.showInputDialog("Escribe tu nombre: ");
			System.out.println("Bienvenido, " + introducir_nombre);
			break;
		case 5:
			System.out.println("Introduce el radio:");
			String radio = leer.nextLine();
			double r = Double.parseDouble(radio);
			double a_circ = Math.PI*Math.pow(r,2);
			System.out.println("El área del círculo es: "+ a_circ);
			break;
		case 6:
			System.out.println("Introduce un número:");
			int num6 = leer.nextInt();
			if (num6%2 == 0) {
				System.out.println("Es divisible entre 2.");
			}
			else {
				System.out.println("No es divisible entre 2.");
			}
			break;
		case 7:
			System.out.println("Escribe el código de un carácter ASCII");
			String textoASCII = leer.nextLine();
			int codigo = Integer.parseInt(textoASCII);
			char caracter = (char)codigo;
			System.out.println(caracter);
			break;
		case 8:
			System.out.println("Escribe un carácter ASCII");
			String textocaracter = leer.nextLine();
			int codigoASCII = Integer.parseInt(textocaracter);
			char caracterASCII =(char)codigoASCII;
			System.out.println(caracterASCII);
			break;
		case 9:
			System.out.println("Introduzca el precio de un producto:");
			String textoproducto = leer.nextLine();
			double producto = Double.parseDouble(textoproducto);
			double iva = (producto*21)/100;
			double producto_final = producto + iva;
			System.out.println("El precio del producto más IVA es " + producto_final);
			break;
		case 10:
			int num10 = 1;
			while (num10<=100) {
				System.out.println(num10);
				num10 ++;
			}
			break;
		case 11:
			for (int num11=1; num11<=100; num11 ++) {
				System.out.println(num11);
			}
			break;
		case 12:
			int num12 = 1;
			while (num12<=100) {
				if ((num12%2==0) && (num12%3==0)) {
					System.out.println(num12);
				}
				num12 ++;
			}
			break;
		case 13:
			System.out.println("Introduzca el número de ventas:");
			int max_ventas = leer.nextInt();
			int num_ventas;
			double total_ventas = 0;
			for (num_ventas = 0; num_ventas < max_ventas; num_ventas ++) {
				System.out.println("Introduzca el importe de la venta:");
				double importe = leer.nextDouble();
				total_ventas =+ importe;
			}
			System.out.println("El importe total de las ventas es " + total_ventas);
		}

}
}
