package practica_3B;
import java.util.Scanner;
import java.util.ArrayList;

public class Libro {
	private int id;
	private String titulo;
	private String autor;
	private String isbn;
	private String genero;
	private int ejemplares;
	
	public Libro() {
		
	}

	public Libro(int id, String titulo, String autor, String isbn, String genero, int ejemplares) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.genero = genero;
		this.ejemplares = ejemplares;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo.toUpperCase();
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor.toUpperCase();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public static void crearLibro(ArrayList <Libro> Libros) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduzca el ID:");
		int id = Integer.parseInt(input.nextLine());
		System.out.println("Introduzca el título:");
		String titulo = input.nextLine();
		System.out.println("Introduzca el autor:");
		String autor = input.nextLine();
		System.out.println("Introduzca el ISBN:");
		String isbn = input.nextLine();
		System.out.println("Introduzca el género:");
		String genero = input.nextLine();
		System.out.println("Introduzca el número de ejemplares:");
		int ejemplares = Integer.parseInt(input.nextLine());
		Libro l1 = new Libro (id, titulo, autor, isbn, genero, ejemplares);
		Libros.add(l1);
		input.close();
	}
}
