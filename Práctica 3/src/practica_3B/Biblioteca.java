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
			System.out.println("----  BIBLIOTECA PÚBLICA DE DAM ----");
			System.out.println("Escoja una opción:");
			System.out.println("1) Añadir una seccion");
			System.out.println("2) Añadir un libro");
			System.out.println("3) Añadir un libro a una sección");
			System.out.println("4) Eliminar un libro de una sección");
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
