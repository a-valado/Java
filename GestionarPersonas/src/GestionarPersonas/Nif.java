package GestionarPersonas;
import java.util.Scanner;

public class Nif {
	private String numNif;
	private String direccion;
	private String nomPadre;
	private String nomMadre;
	
	public Nif() {	
	}
	public Nif(String numNif, String direccion, String nomPadre, String nomMadre) {
		this.setNumNif(numNif);
		this.setDireccion(direccion);
		this.setNomPadre(nomPadre);
		this.setNomMadre(nomMadre);
	}
	
	public Nif(Nif n1) {
		this.setNumNif(n1.numNif);
		this.setDireccion(n1.direccion);
		this.setNomPadre(n1.nomPadre);
		this.setNomMadre(n1.nomMadre);
	}
	public String getNumNif() {
		return numNif;
	}
	public void setNumNif(String numNif) {
		this.numNif = numNif;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNomPadre() {
		return nomPadre;
	}
	public void setNomPadre(String nomPadre) {
		this.nomPadre = nomPadre.toUpperCase();
	}
	public String getNomMadre() {
		return nomMadre;
	}
	public void setNomMadre(String nomMadre) {
		this.nomMadre = nomMadre.toUpperCase();
	}

	//métodos de instancia de la clase Nif
	public void solicitarNif() {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Escribe el código del NIF:");
		this.setNumNif(lector.nextLine());
		System.out.println("Escribe la dirección:");
		this.setDireccion(lector.nextLine());
		System.out.println("Escribe el nombre del padre:");
		this.setNomPadre(lector.nextLine());
		System.out.println("Escribe el nombre de la madre:");
		this.setNomMadre(lector.nextLine());
		lector.close();
	}
	public void mostrarNif(){
		System.out.println("NIF: "+this.numNif);
		System.out.println("Dirección: "+this.direccion);
		System.out.println("Nombre del padre: "+this.nomPadre);
		System.out.println("Nombre de la madre: "+this.nomMadre);
	}
}
