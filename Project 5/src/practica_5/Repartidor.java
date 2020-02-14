package practica_5;
//Import
import java.util.Scanner;

public class Repartidor extends Empleado {
//Atributos
	private int horas;
	private String zona;
	
	public Repartidor () {
		
	}

	public Repartidor(String nombre, String apellido1, String apellido2, String nif, int edad, double salario,
			int horas, String zona) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.horas = horas;
		this.zona = zona;
	}
	 public Repartidor (Repartidor r1) {
		 this.nombre = r1.nombre;
		 this.apellido1 = r1.nombre;
		 this.apellido2 = r1.apellido2;
		 this.nif = r1.nif;
		 this.edad = r1.edad;
		 this.salario = r1.salario;
		 this.horas = r1.horas;
		 this.zona = r1.zona;
	 }

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
//Métodos
	@Override
	public void mostrarAtributos() {
		super.mostrarAtributos();
		System.out.println("Horas: " + this.zona);
		System.out.println("Zona: " + this.zona);
	}
	
	@Override
	public void pedirAlta() {
		super.pedirAlta();
		Scanner input = new Scanner (System.in);
		System.out.println("Introduzca el número de horas trabajadas: ");
		setHoras(Integer.parseInt(input.nextLine()));
		System.out.println("Introduzca la zona de trabajo: ");
		setZona(input.nextLine());
		System.out.println(" ");
	}
}
