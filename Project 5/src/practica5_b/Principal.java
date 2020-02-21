package practica5_b;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		boolean mostrarMenu = true;
		int total_instancias = 0; //Este es el número total de vehículos que se han dado de alta.
		int licencia_taxis = 100; //Esta es la variable a partir de la cual se asignan las licencias de taxi.
		ArrayList <Vehiculo> Flota = new ArrayList <Vehiculo>();
		Scanner lector = new Scanner(System.in);
		
		while (mostrarMenu) {
			System.out.println("--------    MENÚ    --------");
			System.out.println("Elija la opción: ");
			System.out.println("1) Dar de alta un vehículo");
			System.out.println("2) Dar de alta un autobús");
			System.out.println("3) Dar de alta un taxi");
			System.out.println("4) Dar de alta un VTC");
			System.out.println("5) Mostrar toda la flota de vehículos");
			System.out.println("6) Buscar un vehículo");
			System.out.println("7) Buscar un taxi libre");
			System.out.println("99) Salir");
			int opcion = lector.nextInt();
			lector.nextLine();
			
			switch (opcion) {
			case 1:
				System.out.println("Va a dar de alta un vehículo.");
				System.out.println("Introduzca la matrícula:");
				String matricula = lector.nextLine();
				System.out.println("Introduzca el modelo:");
				String modelo = lector.nextLine();
				System.out.println("Introduzca la potencia:");
				int potencia = lector.nextInt();
				lector.nextLine();// Línea vacía para que el lector no se vuelva loco con los int
				Vehiculo v1 = new Vehiculo(total_instancias, matricula, modelo, potencia);
				total_instancias += 1;
				Flota.add(v1);
				break;
			case 2:
				System.out.println("Va a dar de alta un autobús.");
				System.out.println("Introduzca la matrícula:");
				matricula = lector.nextLine();
				System.out.println("Introduzca el modelo:");
				modelo = lector.nextLine();
				System.out.println("Introduzca la potencia:");
				potencia = lector.nextInt();
				lector.nextLine();// Línea vacía para que el lector no se vuelva loco con los int
				System.out.println("Introduzca el número de plazas:");
				int num_plazas = Integer.parseInt(lector.nextLine());
				System.out.println("Introduzca el número de paradas:");
				int num_paradas = Integer.parseInt(lector.nextLine());
				Autobus a1 = new Autobus(total_instancias, matricula, modelo, potencia, num_plazas, num_paradas);
				total_instancias += 1;
				Flota.add(a1);
				break;
				
			case 3:
				System.out.println("Va a dar de alta un taxi.");
				System.out.println("Introduzca la matrícula:");
				matricula = lector.nextLine();
				System.out.println("Introduzca el modelo:");
				modelo = lector.nextLine();
				System.out.println("Introduzca la potencia:");
				potencia = lector.nextInt();
				lector.nextLine();// Línea vacía para que el lector no se vuelva loco con los int
				boolean estado = true;
				System.out.println("Introduzca el número de taxistas:");
				int num_taxistas = Integer.parseInt(lector.nextLine());
				Taxi t1 = new Taxi (total_instancias, matricula, modelo, potencia, licencia_taxis, estado, num_taxistas);
				total_instancias += 1;
				licencia_taxis += 1;
				Flota.add(t1);
				break;

			case 4:
				System.out.println("Va a dar de alta un VTC.");
				System.out.println("Va a dar de alta un taxi.");
				System.out.println("Introduzca la matrícula:");
				matricula = lector.nextLine();
				System.out.println("Introduzca el modelo:");
				modelo = lector.nextLine();
				System.out.println("Introduzca la potencia:");
				potencia = lector.nextInt();
				lector.nextLine();// Línea vacía para que el lector no se vuelva loco con los int
				System.out.println("Introduzca el número máximo de horas:");
				int max_horas = Integer.parseInt(lector.nextLine());
				System.out.println("Introduzca el número de kilómetros del radio de acción:");
				int radio_accion = Integer.parseInt(lector.nextLine());
				System.out.println("Introduzca el nombre de la ciudad:");
				String ciudad = lector.nextLine();
				VTC vtc1 = new VTC(total_instancias, matricula, modelo, potencia, max_horas, radio_accion, ciudad);
				total_instancias +=1;
				Flota.add(vtc1);
				break;
				
			case 5: //Mostrar todos los vehículos de la flota
				System.out.println("Los vehículos de la flota son los siguientes.");
				for (int i=0; i < Flota.size(); i++) {
					Flota.get(i).mostrarAtributos();
					System.out.println();
				}
				break;
				
			case 6: //Buscar un vehículo por id o por matrícula
				Principal.buscarVehículo(Flota);
				break;
				
			case 7: //Buscar el primer taxi que esté libre y que su estado pase a ser "ocupado"
				Taxi.buscarTaxi(Flota);
				break;
				
			case 99: //Salir del programa
				mostrarMenu = false;
				break;
				
			default:
				System.out.println("OPCIÓN NO VÁLIDA");
			}
		}

	}
	public static void buscarVehículo(ArrayList <Vehiculo> Flota) {
		System.out.println("¿Qué tipo de búsqueda desea realizar?");
		System.out.println("1) Por ID");
		System.out.println("2) Por matrícula");
		Scanner input = new Scanner(System.in);
		int opcionBusqueda = Integer.parseInt(input.nextLine());
		int resultado = 0;
		switch (opcionBusqueda) {
		case 1:
			System.out.println("Introduzca el ID a buscar");
			int buscarId = Integer.parseInt(input.nextLine());
			for (int i = 0; i< Flota.size(); i++) {
				if (Flota.get(i).getId() == buscarId){
					Flota.get(i).mostrarAtributos();
					resultado += 1;
				}
			}
			if (resultado == 0) {
				System.out.println("Su búsqueda no ha dado ningún resultado");
			}
			break;
		case 2:
			System.out.println("Introduzca la matrícula a buscar");
			String buscarMatricula = input.nextLine();
			for (int i = 0; i< Flota.size(); i++) {
				if (Flota.get(i).getMatricula().equals(buscarMatricula)){
					Flota.get(i).mostrarAtributos();
					resultado += 1;
				}
			}
			if (resultado == 0) {
				System.out.println("Su búsqueda no ha dado ningún resultado");
			}
			break;
		default:
			System.out.println("OPCIÓN NO VÁLIDA");
		}
	}

}
