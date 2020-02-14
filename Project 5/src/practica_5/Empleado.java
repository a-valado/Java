package practica_5;
//Import
import java.util.Scanner;

public class Empleado {
//Atributos
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String nif;
	protected int edad;
	protected double salario;
	
//Constructores
	public Empleado() {
		
	}

	public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nif = nif;
		this.edad = edad;
		this.salario = salario;
	}
	
	public Empleado (Empleado e1) {
		this.setNombre(e1.nombre);
		this.setApellido1(e1.apellido1);
		this.setApellido2(e1.apellido2);
		this.setNif(e1.nif);
		this.setEdad(e1.edad);
		this.setSalario(e1.salario);
	}

//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.substring(0,1).toUpperCase()+nombre.substring(1);
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1.substring(0,1).toUpperCase()+apellido1.substring(1);
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2.substring(0,1).toUpperCase()+apellido2.substring(1);
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
//MÉTODOS
	public void mostrarAtributos() {
		System.out.println("Nombre:" + this.nombre);
		System.out.println("Apellido 1: " + this.apellido1);
		System.out.println("Apellido 2: " + this.apellido2);
		System.out.println("NIF: " + this.nif);
		System.out.println("Edad: " + this.edad);
		System.out.println("Salario: " + this.salario);
	}
	
	public void pedirAlta() {
		Scanner input = new Scanner (System.in);
		System.out.println("Introduzca el nombre: ");
		setNombre(input.nextLine());
		System.out.println("Introduzca el primer apellido: ");
		setApellido1(input.nextLine());
		System.out.println("Introduzca el segundo apellido: ");
		setApellido2(input.nextLine());
		System.out.println("Introduzca el NIF: ");
		setNif(input.nextLine());
		System.out.println("Introduzca la edad: ");
		setEdad(Integer.parseInt(input.nextLine()));
		while (this.edad < 16) {
			System.out.println("Edad incorrecta. Introduzca la edad de nuevo: ");
			setEdad(Integer.parseInt(input.nextLine()));
		}
		System.out.println("Introduzca el salario: ");
		setSalario(Double.parseDouble(input.nextLine()));
		System.out.println(" ");
	}
	
}
