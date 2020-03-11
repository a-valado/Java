package Practica6_2;
import java.util.Scanner;

public class Quiniela extends Apuesta {
	private String [] partidos;
	
	public Quiniela() {
		
	}
	
	public Quiniela(String nombre, String apellido, int numApuesta, String[] partidos) {
		super(nombre, apellido, numApuesta);
		this.setPartidos(partidos);
	}

	public String[] getPartidos() {
		return partidos;
	}

	public void setPartidos(String[] partidos) {
		this.partidos = partidos;
	}
	
	@Override
	public void mostrarApuesta(){
		super.mostrarApuesta();
		System.out.println("Su apuesta" + this.getPartidos());
	}
	
	public Quiniela crearQuiniela() {
		super.crearApuesta();
		Scanner input = new Scanner(System.in);
		String[] apuesta = new String[15];
		for (int i = 0; i <= apuesta.length; i++) {
			System.out.println("Introduzca su apuesta para el partido "+ i +" de 15 (1,X,2");
			apuesta[i] = input.nextLine();
			
		}
		Quiniela q = new Quiniela (nombre, apellido, numApuesta, apuesta);
		
		return q;
	}
}
