
public abstract class Tarjeta {
	protected String nif;
	protected int pin;
	protected String nombre;
	protected String apellido;
	
	public Tarjeta() {
		
	}
	
	public Tarjeta(String nif, int pin, String nombre, String apellido) {
		this.setNif(nif);
		this.setPin(pin);
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	public Tarjeta(Tarjeta t1) {
		this.setNif(t1.nif);
		this.setPin(t1.pin);
		this.setNombre(t1.nombre);
		this.setApellido(t1.apellido);
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//MÉTODOS
	public void mostrarAtributos(){
		System.out.println("NIF: "+this.getNif());
		System.out.println("PIN: "+this.getPin());
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Apellido: "+this.getApellido());
	
	}
	

}
