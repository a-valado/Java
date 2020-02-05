package practica_4;
import java.util.Scanner;
import java.util.ArrayList;

public class Videoclub {

	public static void main(String[] args) {
		int total_pelis = 0;
		int contador_id =0;
		int menu = 0;
		Scanner lector = new Scanner(System.in);
		ArrayList <Pelicula> Videoclub = new ArrayList <Pelicula>();
		
		while (menu == 0) {
			System.out.println("----  VIDEOCLUB  ----");
			System.out.println("Elija una opci�n: ");
			System.out.println("1) A�adir pel�cula");
			System.out.println("2) Reservar pel�cula");
			System.out.println("3) Buscar pel�cula");
			System.out.println("4) Salir");
			int opcion= lector.nextInt();
			
			if (opcion == 1) {
				if (total_pelis < 3000) {
					a�adirPelicula(contador_id, Videoclub);
					total_pelis += Videoclub.get(contador_id).getTotal_copias();
					contador_id ++;
				}
				else {
					System.out.println("Se ha alcanzado el m�ximo n�mero de pel�culas almacenables.");
				}
				
			}
			if (opcion == 2) {
				if (Videoclub.size() == 0 ) {
					System.out.println("No hay pel�culas.");
				}
				else {
					reservarPeliculas(Videoclub);
				}
			}
			if (opcion == 3) {
				
			}
			if (opcion == 4) {
				menu = 1;
			}
			else {
				System.out.println("Opci�n no v�lida");
			}
		}
	lector.close();
	}
	
	//M�TODOS
	public static void a�adirPelicula(int contador_id, ArrayList <Pelicula> Videoclub) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca el t�tulo:");
		String titulo = input.nextLine();
		System.out.println("Introduzca el director:");
		String director = input.nextLine();
		System.out.println("Introduzca el a�o:");
		int a�o = Integer.parseInt(input.nextLine());
		System.out.println("Introduzca el g�nero:");
		String genero = input.nextLine();
		System.out.println("Introduzca el n�mero de copias:");
		int total_copias = Integer.parseInt(input.nextLine());
		boolean disponible = true;
		int id = contador_id + 1;
		int reservadas = total_copias ;
		Pelicula p = new Pelicula(id, titulo, director, a�o, genero, disponible, total_copias, reservadas);
		Videoclub.add(p);
		input.close();
}	
	public static void listarPeliculas(ArrayList <Pelicula> Videoclub) {
		for (int i=0; i<Videoclub.size(); i ++) {
			System.out.println("ID: " + Videoclub.get(i).getID() + " | T�tulo: " + Videoclub.get(i).getTitulo() + " | Director: " + Videoclub.get(i).getDirector() + " | A�o: " + Videoclub.get(i).getA�o() + " | Genero: " + Videoclub.get(i).getGenero() + " | N�mero de copias: " + Videoclub.get(i).getTotal_copias() + " | Copias disponibles: " + Videoclub.get(i).getReservadas() + " | Disponibilidad: " + Videoclub.get(i).isDisponible());
		}
	}
	public static void reservarPeliculas(ArrayList <Pelicula> Videoclub) {
		Scanner input = new Scanner(System.in);
		listarPeliculas(Videoclub);
		System.out.println("Introduzca el ID de la pel�cula que quiera reservar:");
		int id_reserva = Integer.parseInt(input.nextLine());
		int i = 0;
		while (i<Videoclub.size()) {
			if (Videoclub.get(i).getID() == id_reserva) {
				if (Videoclub.get(i).isDisponible() == true) {
					System.out.println("La pel�cula ha sido reservada.");
					Videoclub.get(i).setReservadas(Videoclub.get(i).getReservadas() - 1);
				}
				if (Videoclub.get(i).isDisponible() == false) {
					System.out.println("La pel�cula no est� disponible.");
				}
			}
		}
	input.close();
	}
	
}
