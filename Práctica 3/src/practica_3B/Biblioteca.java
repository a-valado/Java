package practica_3B;
import java.util.Scanner;
import java.util.ArrayList;


public class Biblioteca {

	public static void main(String[] args) {
		ArrayList <Libro> Libros = new ArrayList <Libro> ();
		ArrayList <Seccion> Secciones = new ArrayList <Seccion> ();
		Scanner input = new Scanner(System.in);
		boolean on = true;
		
		while (on = true) {
			System.out.println("----  BIBLIOTECA P�BLICA DE DAM ----");
			System.out.println("Escoja una opci�n:");
			System.out.println("1) A�adir una seccion");
			System.out.println("2) A�adir un libro");
			System.out.println("3) A�adir un libro a una secci�n");
			System.out.println("4) Eliminar un libro de una secci�n");
			System.out.println("5) Salir");
			int opcion = input.nextInt();
			
			switch (opcion) {
			case 1:
				Seccion.crearSeccion(Secciones);
				break;
			case 2:
				Libro.crearLibro(Libros);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				on = false;
				break;
			}
			
			
		}
		

	}

}
