package practica_4;
import java.util.Scanner;
import java.util.ArrayList;

public class Videoclub {

	public static void main(String[] args) {
		int total_pelis = 0;
		int contador_id = 0;
		boolean menu = true;
		Scanner lector = new Scanner(System.in);
		ArrayList <Pelicula> Videoclub = new ArrayList <Pelicula>();
		
		while (menu == true) {
			System.out.println("------------  VIDEOCLUB  ---------");
			System.out.println("                                  ");
			System.out.println("Elija una opci�n: ");
			System.out.println("                                  ");
			System.out.println("1) A�adir pel�cula");
			System.out.println("2) Reservar pel�cula");
			System.out.println("3) Buscar pel�cula");
			System.out.println("4) Salir");
			int opcion= lector.nextInt();
			
			switch (opcion) {
			case 1:
				if (total_pelis < 3000) {
				 	a�adirPelicula(contador_id, Videoclub);
					total_pelis += Videoclub.get(contador_id).getTotal_copias();
					contador_id ++;
				}
				else {
					System.out.println("Se ha alcanzado el m�ximo n�mero de pel�culas almacenables.");
				}
				break;
			case 2:
				if (Videoclub.size() == 0 ) {
					System.out.println("No hay pel�culas.");
				}
				else {
					reservarPeliculas(Videoclub);
				}
				break;
			case 3:
				buscarPeliculas(Videoclub);
				break;
			case 4:
				menu = false;
				break;
			default:
				System.out.println("Opci�n no v�lida");
				break;
			}
		}
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
	Integer id_reserva = Integer.parseInt(input.nextLine());
	int i = 0;
	while (i<Videoclub.size()) {
		if (Videoclub.get(i).getID() == id_reserva) {
			if (Videoclub.get(i).isDisponible() == true) {
				System.out.println("La pel�cula ha sido reservada.");
				Videoclub.get(i).setReservadas(Videoclub.get(i).getReservadas() - 1);
				if (Videoclub.get(i).getReservadas() == 0) {
					Videoclub.get(i).setDisponible(false);
				}
				i = Videoclub.size();
			}
			else if (Videoclub.get(i).isDisponible() == false) {
				System.out.println("La pel�cula no est� disponible.");
				i = Videoclub.size();
			}
			i++;
		}
	}
}

public static void buscarPeliculas(ArrayList <Pelicula> Videoclub) {
	System.out.println("�Qu� tipo de b�squeda desea realizar?");
	System.out.println("1) Por ID");
	System.out.println("2) Por T�tulo");
	System.out.println("3) Por Director");
	System.out.println("4) Por A�o");
	System.out.println("5) Por G�nero");
	Scanner input = new Scanner(System.in);
	int opcion_busqueda = Integer.parseInt(input.nextLine());
	boolean encontrada = false;
	if (Videoclub.size()>0) {
	switch (opcion_busqueda) {
		case 1: 
			System.out.println("Introduzca su b�squeda:");
			String busqueda1 = input.nextLine();
			for (int i=0; i<Videoclub.size(); i++) {
				if (Videoclub.get(i).getID().toString().contains(busqueda1) == true) {
					System.out.println("ID: " + Videoclub.get(i).getID() + " | T�tulo: " + Videoclub.get(i).getTitulo() + " | Director: " + Videoclub.get(i).getDirector() + " | A�o: " + Videoclub.get(i).getA�o() + " | Genero: " + Videoclub.get(i).getGenero() + " | N�mero de copias: " + Videoclub.get(i).getTotal_copias() + " | Copias disponibles: " + Videoclub.get(i).getReservadas() + " | Disponibilidad: " + Videoclub.get(i).isDisponible());
					encontrada = true;
				}
			}
			if (encontrada == false) {
				System.out.println("Su b�squeda no ha tenido �xito. Pel�cula no encontrada");
			}
			break;
		case 2:
			System.out.println("Introduzca su b�squeda:");
			String busqueda2 = input.nextLine();
			for (int i=0; i<Videoclub.size(); i++) {
				if (Videoclub.get(i).getTitulo().toString().contains(busqueda2) == true) {
					System.out.println("ID: " + Videoclub.get(i).getID() + " | T�tulo: " + Videoclub.get(i).getTitulo() + " | Director: " + Videoclub.get(i).getDirector() + " | A�o: " + Videoclub.get(i).getA�o() + " | Genero: " + Videoclub.get(i).getGenero() + " | N�mero de copias: " + Videoclub.get(i).getTotal_copias() + " | Copias disponibles: " + Videoclub.get(i).getReservadas() + " | Disponibilidad: " + Videoclub.get(i).isDisponible());
					encontrada = true;
				}
			}
			if (encontrada == false) {
				System.out.println("Su b�squeda no ha tenido �xito. Pel�cula no encontrada");
			}
			break;
		case 3:
			System.out.println("Introduzca su b�squeda:");
			String busqueda3 = input.nextLine();
			for (int i=0; i<Videoclub.size(); i++) {
				if (Videoclub.get(i).getDirector().toString().contains(busqueda3) == true) {
					System.out.println("ID: " + Videoclub.get(i).getID() + " | T�tulo: " + Videoclub.get(i).getTitulo() + " | Director: " + Videoclub.get(i).getDirector() + " | A�o: " + Videoclub.get(i).getA�o() + " | Genero: " + Videoclub.get(i).getGenero() + " | N�mero de copias: " + Videoclub.get(i).getTotal_copias() + " | Copias disponibles: " + Videoclub.get(i).getReservadas() + " | Disponibilidad: " + Videoclub.get(i).isDisponible());
					encontrada = true;
				}
			}
			if (encontrada == false) {
				System.out.println("Su b�squeda no ha tenido �xito. pel�cula no encontrada");
			}
			break;
		case 4:
			System.out.println("Introduzca su b�squeda:");
			String busqueda4 = input.nextLine();
			for (int i=0; i<Videoclub.size(); i++) {
				if (Videoclub.get(i).getA�o().toString().contains(busqueda4) == true) {
					System.out.println("ID: " + Videoclub.get(i).getID() + " | T�tulo: " + Videoclub.get(i).getTitulo() + " | Director: " + Videoclub.get(i).getDirector() + " | A�o: " + Videoclub.get(i).getA�o() + " | Genero: " + Videoclub.get(i).getGenero() + " | N�mero de copias: " + Videoclub.get(i).getTotal_copias() + " | Copias disponibles: " + Videoclub.get(i).getReservadas() + " | Disponibilidad: " + Videoclub.get(i).isDisponible());
					encontrada = true;
				}
			}
			if (encontrada == false) {
				System.out.println("Su b�squeda no ha tenido �xito. pel�cula no encontrada");
			}
			break;
		case 5:
			System.out.println("Introduzca su b�squeda:");
			String busqueda5 = input.nextLine();
			for (int i=0; i<Videoclub.size(); i++) {
				if (Videoclub.get(i).getGenero().toString().contains(busqueda5) == true) {
					System.out.println("ID: " + Videoclub.get(i).getID() + " | T�tulo: " + Videoclub.get(i).getTitulo() + " | Director: " + Videoclub.get(i).getDirector() + " | A�o: " + Videoclub.get(i).getA�o() + " | Genero: " + Videoclub.get(i).getGenero() + " | N�mero de copias: " + Videoclub.get(i).getTotal_copias() + " | Copias disponibles: " + Videoclub.get(i).getReservadas() + " | Disponibilidad: " + Videoclub.get(i).isDisponible());
					encontrada = true;
				}
			}
			if (encontrada == false) {
				System.out.println("Su b�squeda no ha tenido �xito. pel�cula no encontrada");
			}
			break;
		default:
			System.out.println("Opci�n no v�lida.");
	}
	}
	else {
		System.out.println("No hay pel�culas en el cat�logo.");
	}
}
}