package proyectoHerencia;

public class Empleado extends Persona {
	private double sueldo;
	private String nuss;
	
	public Empleado () {
		
	}
	
	public Empleado(String nombre, String apellido, double sueldo, String nuss) {
		super(nombre, apellido);
		this.sueldo = sueldo;
		this.nuss = nuss;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getNuss() {
		return nuss;
	}
	public void setNuss(String nuss) {
		this.nuss = nuss;
	}
	
	public void realizarPrueba() {
		this.getNombre();
	}
	
	
	public void mostrarSaludo() {
		super.mostrarSaludo();
		System.out.println("saludo Empleado");
	}
}
