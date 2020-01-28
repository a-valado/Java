package practica_3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean menu = true;
		Scanner lector = new Scanner(System.in);
		
		while (menu=true) {
			System.out.println("----- MENU -----");
			System.out.println("Elija una opción:");
			System.out.println("1) Crear dos cuentas");
			System.out.println("2) Realizar un ingreso");
			System.out.println("3) Realizar un reintegro");
			System.out.println("4) Realizar una transferencia");
			System.out.println("5) Salir");
			int opcion = lector.nextInt();
			
			switch (opcion) {
				case 1:
					Cuenta c1 = new Cuenta();
					c1.crearCuenta();
					Cuenta c2 = new Cuenta();
					c2.crearCuenta();
					break;
				case 2:
					System.out.println("Escoja la cuenta con la que realizar la operación:");
					String opcionCuenta = lector.nextLine();
					if (opcionCuenta == c1.getNumCuenta()) {
						
					}
					else if (opcionCuenta == c2.getNumCuenta()) {
						
					}
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					menu = false;
					break;
			}
		}
		lector.close();
	}

}
