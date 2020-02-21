package practica5_b;

public class Autobus extends Vehiculo {
	private int num_plazas;
	private int num_paradas;
	
	public Autobus() {
		
	}
	
	public Autobus(int id, String matricula, String modelo, int potencia, int num_plazas, int num_paradas) {
		super(id, matricula, modelo, potencia);
		this.setNum_plazas(num_plazas);
		this.setNum_paradas(num_paradas);
	}
	
	public Autobus (Autobus a1) {
		this.setId(a1.id);
		this.setMatricula(a1.matricula);
		this.setModelo(a1.modelo);
		this.setPotencia(a1.potencia);
		this.setNum_plazas(a1.num_plazas);
		this.setNum_paradas(a1.num_paradas);
	}
	public int getNum_plazas() {
		return num_plazas;
	}

	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}

	public int getNum_paradas() {
		return num_paradas;
	}

	public void setNum_paradas(int num_paradas) {
		this.num_paradas = num_paradas;
	}
	
	
	@Override
	public void mostrarAtributos() {
	super.mostrarAtributos();
	System.out.println("Número de plazas: "+ this.getNum_plazas());
	System.out.println("Número de paradas: "+ this.getNum_paradas());
	
}	
}
