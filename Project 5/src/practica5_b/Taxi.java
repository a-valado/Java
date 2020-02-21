package practica5_b;

import java.util.ArrayList;
import java.util.Scanner;

public class Taxi extends Vehiculo {
	private int num_licencia;
	private boolean estado;
	private int num_taxistas;
	
	
	public Taxi () {
		
	}

	public Taxi(int id, String matricula, String modelo, int potencia, int num_licencia, boolean estado,
			int num_taxistas) {
		super(id, matricula, modelo, potencia);
		this.setNum_licencia(num_licencia);
		this.setEstado(estado);
		this.setNum_taxistas(num_taxistas);
	}
	
	public Taxi (Taxi t1) {
		this.setId(t1.id);
		this.setMatricula(t1.matricula);
		this.setModelo(t1.modelo);
		this.setPotencia(t1.potencia);
		this.setNum_licencia(t1.num_licencia);
		this.setEstado(t1.estado);
		this.setNum_taxistas(t1.num_taxistas);
	}

	public int getNum_licencia() {
		return num_licencia;
	}

	public void setNum_licencia(int num_licencia) {
		this.num_licencia = num_licencia;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getNum_taxistas() {
		return num_taxistas;
	}

	public void setNum_taxistas(int num_taxistas) {
		this.num_taxistas = num_taxistas;
	}
	
	@Override
	public void mostrarAtributos() {
		super.mostrarAtributos();
		System.out.println("Número de licencia: "+ this.getNum_licencia());
		System.out.println("Estado: "+ this.establecerEstado());
		System.out.println("Número de taxistas: "+ this.getNum_taxistas());
	}
	
	public String establecerEstado() {//Este método sirve para establecer el taxi como "libre"  o "ocupado"
		String estado = "ocupado";//cuando se utiliza el método mostrarAtributos() de esta clase
		if (this.isEstado() == true) {
			estado = "libre";
			return estado;
		}
		else {
			return estado;
		}
	}
	
	public static void buscarTaxi(ArrayList <Vehiculo> Flota) {
		boolean taxi_encontrado = false;
		int i = 0;
		int resultado = 0;
		while (i < Flota.size() && taxi_encontrado == false) {
			if (Flota.get(i) instanceof Taxi){
				if (((Taxi)Flota.get(i)).isEstado() == true) {
					((Taxi)Flota.get(i)).setEstado(false);
					System.out.println("Se ha encontrado un taxi libre, tiene la siguiente ID: " + ((Taxi)Flota.get(i)).getId() );
					resultado +=1;
					taxi_encontrado = true;
				}
			}
			i++;
		}
		if (resultado == 0) {
			System.out.println("No hay disponible ningún taxi libre.");
		}
	}
	
	public static void liberarTaxi(ArrayList <Vehiculo> Flota) {
		System.out.println("Va a liberar un taxi");
		System.out.println("Introduzca la ID del taxi que desee dejar libre: ");
		Scanner input = new Scanner(System.in);
		int buscarId = Integer.parseInt(input.nextLine());
		int resultado = 0;
		for (int i = 0; i< Flota.size(); i++) {
			if (Flota.get(i) instanceof Taxi) {
				if (Flota.get(i).getId() == buscarId){
					if (((Taxi)Flota.get(i)).isEstado() == false){
						((Taxi)Flota.get(i)).setEstado(true);
						resultado +=1;
					}
				}
			}
		}
		if (resultado == 0) {
			System.out.println("No se ha encontrado ningún taxi con esa ID");
		}
	
	}
}
