import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
	
	public static Cajero crearCajero() {
		int ultimo = 1;
		int id_cajero = ultimo + 1;
		int[][] cargaBilletes = {{500, 10}, {200, 0}, {100, 0}, {50, 27}, {20, 0}, {10, 18}, {5, 25}};
		ArrayList <Tarjeta> listaTarjetas = new ArrayList <Tarjeta>();
		
		Cajero micajero = new Cajero(ultimo, id_cajero, cargaBilletes, listaTarjetas);
		
		T_debito tarj1 = new T_debito("33888999m", 1111, "Jorge", "Lorenzo", 20000);
		T_credito tarj2 = new T_credito("34888999m", 2222, "Rafa", "Nadal", 1000, 5000);
	
		micajero.getLista_tarjetas().add(tarj1);
		micajero.getLista_tarjetas().add(tarj2);
		
		return micajero;
	}
	public static void mostrarCajero(Cajero micajero) {
		for (int i =0; i<micajero.getLista_billetes().length;i++) {
			System.out.println(micajero.getLista_billetes()[i][1] + " billetes de " + micajero.getLista_billetes()[i][0]);
		}
		for (int i = 0; i<micajero.getLista_tarjetas().size(); i++) {
			//Las tarjetas solo pueden ser de dos tipos, así que solo es necesaria hacer una comprobación. 
			if (micajero.getLista_tarjetas().get(i) instanceof T_debito) {
				((T_debito) micajero.getLista_tarjetas().get(i)).mostrarAtributos();
			}
			else {
				((T_credito) micajero.getLista_tarjetas().get(i)).mostrarAtributos();
			}
		}
			
	}

	public static void main(String[] args) {
		boolean mostrarMenu = true;
		Scanner input = new Scanner(System.in);
		Cajero micajero = crearCajero();
		while (mostrarMenu) {
			mostrarCajero(micajero);
			System.out.println("MENU");
			System.out.println("Escoja una opción");
			System.out.println("1) Sacar dinero");
			System.out.println("2) Salir");
			int opcion = input.nextInt();
			input.nextLine(); //Línea vacía para que el retorno de carro no se coma el int.
			
			switch (opcion) {
			
			case 1:
				micajero.sacarDinero();
				break;
			case 2:
				mostrarMenu = false;
				break;
			default:
				System.out.println("Escoja una de las dos opciones disponibles.");
			}
		}

	}

}
