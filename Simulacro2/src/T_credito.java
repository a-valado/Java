
public class T_credito extends Tarjeta{
	//ATRIBUTOS
	protected int saldo;
	protected int credito;
	
	//CONSTRUCTORES
	public T_credito(){
		
	}
	
	public T_credito(String nif, int pin, String nombre, String apellido, int saldo, int credito) {
		super(nif, pin, nombre, apellido);
		this.setSaldo(saldo);
		this.setCredito(credito);
	}
	
	public T_credito (T_credito t1) {
		this.setNif(t1.nif); 
		this.setPin(t1.pin);
		this.setNombre(t1.nombre); 
		this.setApellido(t1.apellido);
		this.setSaldo(saldo);
		this.setCredito(credito);
	}

	//GETTERS Y SETTERS
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getCredito() {
		return credito;
	}
	
	public void setCredito(int credito) {
		this.credito = credito;
	}
	
	//MÉTODOS
	@Override
	public void mostrarAtributos() {
		super.mostrarAtributos();
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Credito: "+this.getCredito());
	}
	
	public void disminuirSaldoDisponible(int cantidad) {
		//Si la cantidad a retirar es menor o igual al saldo, simplemente lo restamos de ahí.
		if (cantidad <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - cantidad);
		}
		//Si la cantidad es mayor, debemos sustraer la diferencia del crédito y establecer el saldo a 0.
		else {
			int diferencia = cantidad - saldo;
			this.setSaldo(0);
			this.setCredito(this.getCredito() - diferencia);
		}
		
	}

	
	
	
	
	

}
