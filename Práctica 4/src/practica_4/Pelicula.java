package practica_4;
import java.util.Scanner;

public class Pelicula {
	private Integer ID;
	private String titulo;
	private String director;
	private Integer año;
	private String genero;
	private boolean disponible;
	private int total_copias;
	private int reservadas;
	
	Scanner lector = new Scanner(System.in);
	
	public Pelicula() {
		
	}
	
	public Pelicula(int iD, String titulo, String director, Integer año, String genero, boolean disponible,
			int total_copias, int reservadas) {
		this.ID = iD;
		this.setTitulo(titulo);
		this.setDirector(director);
		this.año = año;
		this.genero = genero;
		this.disponible = disponible;
		this.total_copias = total_copias;
		this.reservadas = reservadas;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD+1;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo.substring(0,1).toUpperCase()+titulo.substring(1);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director.substring(0,1).toUpperCase()+director.substring(1);
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero.substring(0,1).toUpperCase()+genero.substring(1);
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
