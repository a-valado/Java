package practica5_b;

public class VTC extends Vehiculo{
	private int max_horas;
	private int radio_accion;
	private String ciudad;
	
	public VTC() {
		
	}

	public VTC(int id, String matricula, String modelo, int potencia, int max_horas, int radio_accion,
			String ciudad) {
		super(id, matricula, modelo, potencia);
		this.setMax_horas(max_horas);
		this.setRadio_accion(radio_accion);
		this.setCiudad(ciudad);
	}
	
	public VTC (VTC v1) {
		this.setId(v1.id);
		this.setMatricula(v1.matricula);
		this.setModelo(v1.modelo);
		this.setPotencia(v1.potencia);
		this.setMax_horas(v1.max_horas);
		this.setRadio_accion(v1.radio_accion);
		this.setCiudad(v1.ciudad);
	}

	public int getMax_horas() {
		return max_horas;
	}

	public void setMax_horas(int max_horas) {
		this.max_horas = max_horas;
	}

	public int getRadio_accion() {
		return radio_accion;
	}

	public void setRadio_accion(int radio_accion) {
		this.radio_accion = radio_accion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Override
	public void mostrarAtributos() {
		super.mostrarAtributos();
		System.out.println("Número máximo de horas: "+ this.getMax_horas());
		System.out.println("Radio de acción (en Km): "+ this.getRadio_accion());
		System.out.println("Ciudad: "+ this.getCiudad());
		
	}
}
