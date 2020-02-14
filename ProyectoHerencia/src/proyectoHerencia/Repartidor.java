package proyectoHerencia;

public class Repartidor extends Empleado {
	private int numRepartos;
	
	public Repartidor(){	
		
	}

	public Repartidor(String nombre, String apellido, double sueldo, String nuss, int numRepartos) {
		super(nombre, apellido, sueldo, nuss);
		this.numRepartos = numRepartos;
	}

	public int getNumRepartos() {
		return numRepartos;
	}

	public void setNumRepartos(int numRepartos) {
		this.numRepartos = numRepartos;
	}
	
	public void mostrarSaludo() {
		super.mostrarSaludo();
		System.out.println("Saludo Repartidor");
	}
}
