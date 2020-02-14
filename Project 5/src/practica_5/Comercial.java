package practica_5;
//Import
import java.util.Scanner;

public class Comercial extends Empleado {
//Atributos
	private int ventas;
	private int comision;
	
//Constructores
	public Comercial() {
		
	}

	public Comercial(String nombre, String apellido1, String apellido2, String nif, int edad, double salario, int ventas,
			int comision) {
		super(nombre, apellido1, apellido2, nif, edad, salario);
		this.ventas = ventas;
		this.comision = comision;
}
	public Comercial (Comercial c1) {
		this.nombre = c1.nombre;
		this.apellido1 = c1.apellido1;
		this.apellido2 = c1.apellido2;
		this.nif = c1.nif;
		this.edad = c1.edad;
		this.salario = c1.salario;
		this.ventas = c1.ventas;
		this.comision = c1.comision;
	}
	
//Getters y Setters
	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}
	
//Métodos
	@Override
	public void mostrarAtributos() {
		super.mostrarAtributos();
		System.out.println("Ventas: " + this.ventas);
		System.out.println("Comisión: " + this.comision + "%");
	}
	
	@Override
	public void pedirAlta() {
		super.pedirAlta();
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de ventas");
		setVentas(Integer.parseInt(input.nextLine()));
		System.out.println("Introduzca el porcentaje de comisión");
		setComision(Integer.parseInt(input.nextLine()));
		System.out.println(" ");
	}
}
