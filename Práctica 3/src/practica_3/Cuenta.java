package practica_3;
import java.util.ArrayList;
import java.util.Scanner;

public class Cuenta {
	private String nombre;
	private String numCuenta;
	private double tipoInt;
	private double saldo;
	private int pin;
	
	static Scanner lector = new Scanner(System.in);
	
	//Constructores
	public Cuenta() {
		
	}
	public Cuenta(String nombre, String numCuenta, double tipoInt, double saldo) {
		this.setNombre(nombre);
		this.setNumCuenta(numCuenta);
		this.setTipoInt(tipoInt);
		this.setSaldo(saldo);
		this.setPin(pin);
	}
	public Cuenta(Cuenta c1) {
		this.setNombre(c1.nombre);
		this.setNumCuenta(c1.numCuenta);
		this.setTipoInt(c1.tipoInt);
		this.setSaldo(c1.saldo);
		this.setPin(c1.pin);
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getTipoInt() {
		return tipoInt;
	}
	public void setTipoInt(double tipoInt) {
		this.tipoInt = tipoInt;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	//Métodos de la clase
	public void crearCuenta() {
		System.out.println("Introduzca el nombre: ");
		this.nombre = lector.nextLine();
		System.out.println("Introduzca el número de la cuenta: ");
		this.numCuenta = lector.nextLine();
		System.out.println("Introduzca el tipo de interés: ");
		this.tipoInt = Double.parseDouble(lector.nextLine());
		System.out.println("Introduzca el saldo");
		this.saldo = Double.parseDouble(lector.nextLine());
		System.out.println("Introduzca el PIN: ");
		this.pin = Integer.parseInt(lector.nextLine());
	}
	
	public boolean ingresarDinero() {
		boolean comprobacion = false;
		System.out.println("Introduzca la cantidad que desea ingresar: ");
		double ingreso = Double.parseDouble(lector.nextLine());
		if (ingreso > 0) {
			this.setSaldo(saldo + ingreso);
			System.out.println("El saldo actual es de "+this.saldo);
			comprobacion = true;
			return comprobacion;
		}
		else {
			System.out.println("No se puede ingresar aquello que no se posee");
			return comprobacion;
		}
	}
	
	public boolean retirarDinero() {
		boolean comprobacion = false;
		System.out.println("Introduzca la cantidad que desea retirar: ");
		double retiro = Double.parseDouble(lector.nextLine());
			if (retiro > this.saldo) {
				System.out.println("De aquello que ya está vacío, no se puede obtener nada");
				return comprobacion;
			}
			else {
				this.setSaldo(saldo - retiro);
				System.out.println("El saldo actual es de "+this.saldo);
				comprobacion = true;
				return comprobacion;
			}
	}
	
	public void transferirDinero(ArrayList <Cuenta> Banco, String cuentaDestino, double importe, int comprobacion) {
		int j = 0;
		while (j>Banco.size()) {
			if (cuentaDestino == Banco.get(j).getNumCuenta() && importe < Banco.get(comprobacion).getSaldo()) {
				Banco.get(j).setSaldo(Banco.get(j).getSaldo() + importe);
				Banco.get(comprobacion).setSaldo(Banco.get(comprobacion).getSaldo() - importe);
			}
		}
	}
	
	public int iniciarSesion (ArrayList <Cuenta> Banco, String numCuenta, int pin) {
		int i = 0;
		boolean inicio = false;
		while (i< Banco.size()) {
			if (numCuenta == Banco.get(i).getNumCuenta() && pin == Banco.get(i).getPin()) {
				inicio = true;
				if (inicio == true) {
					System.out.println("Inicio de sesión correcto");
					return i;
				}
				else {
					i++;
				}
			}
		}
		return -1;
	}
}