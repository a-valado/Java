package practica_3B;
import java.util.Scanner;
import java.util.ArrayList;

public class Seccion {
	private int id;
	private String nombre;
	private int capacidad;
	private int cantidad;
	private String encargado;
	
	
	public Seccion() {
		
	}

	public Seccion(int id, String nombre, int capacidad, int cantidad, String encargado) {
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.cantidad = cantidad;
		this.encargado = encargado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}
	
	public static void crearSeccion(ArrayList <Seccion> Secciones) {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduzca el ID:");
		int id = Integer.parseInt(input.nextLine());
		System.out.println("Introduzca el nombre de la sección:");
		String nombre = input.nextLine();
		System.out.println("Introduzca el número máximo de libros de la sección:");
		int capacidad = Integer.parseInt(input.nextLine());
		System.out.println("Introduzca el encargado:");
		String encargado = input.nextLine();
		int cantidad = 0;
		Seccion s1 = new Seccion (id, nombre, capacidad, cantidad, encargado);
		Secciones.add(s1);
		input.close();
	}
	
}
