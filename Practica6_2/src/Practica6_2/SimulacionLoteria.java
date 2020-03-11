package Practica6_2;
import java.util.Scanner;
import java.util.ArrayList;

public class SimulacionLoteria {
	
	public static void main(String[] args) {
	boolean menuPrincipal = true;
	ArrayList <Apuesta> loteria = new ArrayList <Apuesta>();
	Scanner input = new Scanner(System.in);
	
	while (menuPrincipal) {
		System.out.println(" -----------    LOTERÍA    -----------");
		System.out.println("| Escoja una opción:                  |");
		System.out.println("|                                     |");
		System.out.println("| 1) Realizar apuesta Primitiva       |");
		System.out.println("| 2) Realizar apuesta Quiniela        |");
		System.out.println("| 3) Realizar Simulación              |");
		System.out.println("| 4) Mostrar Apuestas                 |");
		System.out.println("| 5) Salir                            |");
		System.out.println("|                                     |");
		System.out.println(" -------------------------------------");
		int opcionMenu = input.nextInt();
		
		switch (opcionMenu) {
		case 1:
			Primitiva neandertal = new Primitiva();
			neandertal.crearPrimitiva();
			loteria.add(neandertal);
			break;
		case 2:
			Quiniela furbo = new Quiniela();
			furbo.crearApuesta();
			loteria.add(furbo);
			break;
		case 3:
			//MOSTRAR APUESTAS
		default:
			System.out.println("Escoja una de las opciones indicadas.");
		}
	}

	}

}
