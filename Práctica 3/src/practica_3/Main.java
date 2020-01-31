package practica_3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean menu = true;
		boolean submenu =false;
		
		Scanner lector = new Scanner(System.in);
		ArrayList <Cuenta> Banco = new ArrayList <Cuenta>();
		Cuenta c1 = new Cuenta();
		while (menu==true) {
			System.out.println("----- INICIO -----");
			System.out.println("Elija una opción:");
			System.out.println("1) Crear nueva cuenta");
			System.out.println("2) Iniciar sesión");
			System.out.println("3) Salir");
			int opcion = lector.nextInt();
			switch (opcion) {
				case 1:
					Cuenta c = new Cuenta();
					c.crearCuenta();
					Banco.add(c);
					break;
				case 2:
					System.out.println("Introduzca el número de cuenta");
					String numCuenta = lector.nextLine();
					System.out.println("Introduzca el PIN");
					int PIN = Integer.parseInt(lector.nextLine());
					int comprobacion = c1.iniciarSesion(Banco, numCuenta, PIN);
					if (comprobacion > -1) {
						submenu = true;
					}
					while (submenu==true) {
						System.out.println("----- MENU -----");
						System.out.println("Elija una opción:");
						
						System.out.println("1) Realizar un ingreso");
						System.out.println("2) Realizar un reintegro");
						System.out.println("3) Realizar una transferencia");
						System.out.println("4) Salir");
						int subopcion = Integer.parseInt(lector.nextLine());
					
						switch (subopcion) {
							case 1:
								Banco.get(comprobacion).ingresarDinero();
								break;
							case 2:
								Banco.get(comprobacion).retirarDinero();
								break;
							case 3:
								System.out.println("Introduzca el número de cuenta a la que quiere transferir dinero:");
								String cuentaDestino = lector.nextLine();
								System.out.println("Introduzca el importe a transferir");
								double importe = Double.parseDouble(lector.nextLine());
								Banco.get(comprobacion).transferirDinero(Banco, cuentaDestino, importe, comprobacion);
								break;
							case 4:
								menu = false;
								break;
						}
					break;
					}
			
		}
		
		}
		lector.close();
	}

}
