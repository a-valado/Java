package practica5_b;

public class Vehiculo {
	protected int id;
	protected String matricula;
	protected String modelo;
	protected int potencia;
	
	public Vehiculo() {
		
	}

	public Vehiculo(int id, String matricula, String modelo, int potencia) {
		this.setId(id);
		this.setMatricula(matricula);
		this.setModelo(modelo);
		this.setPotencia(potencia);
	}
	
	public Vehiculo (Vehiculo v1) {
		this.id = v1.id;
		this.matricula = v1.matricula;
		this.modelo = v1.modelo;
		this.potencia = v1.potencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula.toUpperCase();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo.substring(1,0).toUpperCase() + modelo.substring(1);
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void mostrarAtributos() {
		System.out.println("Id: "+ this.getId());
		System.out.println("Matrícula: "+ this.getMatricula());
		System.out.println("Modelo: "+ this.getModelo());
		System.out.println("Potencia: "+ this.getPotencia());
		System.out.println();
	}
	
	
	
}
