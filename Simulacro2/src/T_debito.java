
public class T_debito extends Tarjeta {
	//ATRIBUTOS
	protected int saldo;

	//CONSTRUCTORES
	public T_debito() {
		
	}
	
	public T_debito(String nif, int pin, String nombre, String apellido, int saldo) {
		super(nif, pin, nombre, apellido);
		this.setSaldo(saldo);
	}
	
	public T_debito(T_debito t1) {
		this.setNif(t1.nif); 
		this.setPin(t1.pin);
		this.setNombre(t1.nombre); 
		this.setApellido(t1.apellido);
		this.setSaldo(t1.saldo);
	}

	//GETTERS Y SETTERS
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	//MÉTODOS
	@Override
	public void mostrarAtributos() {
		super.mostrarAtributos();
		System.out.println("Saldo: "+this.getSaldo());
	}
	
	public void disminuirSaldoDisponible(int cantidad) {
		//Restamos al saldo la cantidad de dinero que queremos retirar.
		this.setSaldo(this.getSaldo() - cantidad);
	}
	
}
