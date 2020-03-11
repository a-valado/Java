package Practica6_2;

import java.util.Scanner;

public abstract class Apuesta {
	protected String nombre;
	protected String apellido;
	protected int numApuesta;
	
	int num = 1;
	
	public Apuesta() {
		
	}
	
	public Apuesta(String nombre, String apellido, int numApuesta) {
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setNumApuesta(numApuesta);
	}
	
	public Apuesta(Apuesta a) {
		this.setNombre(a.nombre);
		this.setApellido(a.apellido);
		this.setNumApuesta(a.numApuesta);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumApuesta() {
		return numApuesta;
	}

	public void setNumApuesta(int numApuesta) {
		this.numApuesta = numApuesta;
	}
	
	
	public void mostrarApuesta() {
		System.out.println("Nombre: "+ this.getNombre());
		System.out.println("Apellido: "+ this.getApellido());
		System.out.println("Nº de apuesta: "+ this.getNumApuesta());
	}
	
	public void crearApuesta() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca su nombre en mayúsculas:");
		String nombre = input.nextLine();
		System.out.println("Introduzca su apellido en mayúsculas: ");
		String apellido = input.nextLine();
		int numApuesta = num;
		num ++;
	}
}
