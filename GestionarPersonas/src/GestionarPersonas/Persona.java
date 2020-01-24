package GestionarPersonas;
import java.util.Scanner;

public class Persona {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private Nif infonif = new Nif();
	
	public Persona() {
	}
	public Persona(String nombre, String apellido1, String apellido2, int edad, Nif infonif) {
		this.setNombre(nombre);
		this.setApellido1(apellido1);
		this.setApellido2(apellido2);
		this.setEdad(edad);
		this.setInfonif(infonif);
	}
	public Persona(Persona p1) {
		this.setNombre(p1.nombre);
		this.setApellido1(p1.apellido1);
		this.setApellido2(p1.apellido2);
		this.setEdad(p1.edad);
		this.setInfonif(infonif);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1.toUpperCase();
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2.toUpperCase();
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Nif getInfonif() {
		return infonif;
	}
	public void setInfonif(Nif infonif) {
		this.infonif = infonif;
	}
	//métodos de instancia de la clase Persona
	public void  solicitarDatos() {
		Scanner lector = new Scanner(System.in);
	
		System.out.println("Escribe el nombre:");
		this.setNombre(lector.nextLine());
		System.out.println("Escribe el primer apellido:");
		this.setApellido1(lector.nextLine());
		System.out.println("Escribe el segundo apellido:");
		this.setApellido2(lector.nextLine());
		System.out.println("Escribe la edad:");
		this.setEdad(Integer.parseInt(lector.nextLine()));
		this.infonif.solicitarNif();
		lector.close();
	}
	public void mostrarDatos() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Apellido 1: "+this.apellido1);
		System.out.println("Apellido 2: "+this.apellido2);
		System.out.println("Edad: "+this.edad);
		this.infonif.mostrarNif();
	}
}
