package practica_4;
import java.util.Scanner;

public class Pelicula {
	private int ID;
	private String titulo;
	private String director;
	private int a�o;
	private String genero;
	private boolean disponible;
	private int total_copias;
	private int reservadas;
	
	Scanner lector = new Scanner(System.in);
	
	public Pelicula() {
		
	}
	
	public Pelicula(int iD, String titulo, String director, int a�o, String genero, boolean disponible,
			int total_copias, int reservadas) {
		this.ID = iD;
		this.setTitulo(titulo);
		this.setDirector(director);
		this.a�o = a�o;
		this.genero = genero;
		this.disponible = disponible;
		this.total_copias = total_copias;
		this.reservadas = reservadas;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD+1;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo.toUpperCase();
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director.toUpperCase();
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getTotal_copias() {
		return total_copias;
	}

	public void setTotal_copias(int total_copias) {
		this.total_copias = total_copias;
	}

	public int getReservadas() {
		return reservadas;
	}

	public void setReservadas(int reservadas) {
		this.reservadas = reservadas;
	}
	}
