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
			break;
		case 14:
			System.out.println("Introduzca a: ");
			int a = leer.nextInt();
			System.out.println("Introduzca b: ");
			int b = leer.nextInt();
			System.out.println("Introduzca c: ");
			int c = leer.nextInt();
			double determinante = Math.pow(b, 2) - (4*a*c);
			
			if (determinante>=0) {
				double x1 = ((b*-1)+Math.sqrt(determinante))/ (2*a);
				double x2 = ((b*-1)-Math.sqrt(determinante))/ (2*a);
				System.out.println("X puede valer "+ x1 +" o "+ x2);
			} else {
				System.out.println("La ecuación no tiene solución porque el determinante es negativo.");
			}
			break;
		case 15:
			System.out.println("Introduzca un número mayor o igual que cero: ");
			int num15;
			do {
				System.out.println("Introduzca un número mayor o igual que cero: ");
				num15 = leer.nextInt();
			} while (num15 < 0);
			System.out.println(num15 + " es mayor o igual que 0");
			break;
		case 16:
			System.out.println("Escriba una contraseña: ");
			String contraseña = leer.nextLine();
			int intentos = 0;
			boolean contraseña_correcta = false;
			while (contraseña_correcta = false && intentos<3) {
				System.out.println("Escriba la contraseña");
				String respuesta = leer.nextLine();
				if (respuesta == contraseña) {
					contraseña_correcta = true;
				} else {
					intentos ++;
				}
			}
			if (contraseña_correcta == true){
				System.out.println("¡Contraseña correcta!");
			} else if (intentos == 3) {
				System.out.println("ERROR: Lo has intentado demasiadas veces.");
			}
			break;
		case 17:
			System.out.println("Introduzca un día de la semana: ");
			String opcion17 = leer.nextLine();
			switch (opcion17) {
			case "lunes":
				System.out.println("Es laborable.");
				break;
			case "martes":
				System.out.println("Es laborable.");
				break;
			case "miércoles":
				System.out.println("Es laborable.");
				break;
			case "jueves":
				System.out.println("Es laborable.");
				break;
			case "viernes":
				System.out.println("Es laborable.");
				break;
			case "sábado":
				System.out.println("No es laborable.");
				break;
			case "domingo":
				System.out.println("No es laborable.");
				break;
			}
			break;
		case 18:
			System.out.println("Introduzca un número.");
			int num18a = leer.nextInt();
			System.out.println("Introduzca otro número.");
			int num18b = leer.nextInt();
			for (int i = 0; i<10; i++) {
				int num18random = (int)Math.floor(Math.random()*(num18a-num18b)+num18b);
				System.out.println(num18random);
			}
		}
}
}
