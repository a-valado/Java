package proyectoHerencia;

public class Vehiculo {
	private String matricula;
	private String numBastidor;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String matricula, String numBastidor) {
		this.matricula = matricula;
		this.numBastidor = numBastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}
	
	public void realizarPrueba() {
	
	}
}
