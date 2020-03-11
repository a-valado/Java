package Practica6_2;
import java.util.Scanner;

public class Primitiva extends Apuesta {
	private int[] listaNum;
	private int aciertos;
	
	public Primitiva() {
		
	}
	
	public Primitiva(String nombre, String apellido, int numApuesta, int[] listaNum, int aciertos) {
		super(nombre, apellido, numApuesta);
		this.setListaNum(listaNum);
		this.setAciertos(aciertos);
	}
	
	public Primitiva (Primitiva p) {
		this.setNombre(p.nombre);
		this.setApellido(p.apellido);
		this.setNumApuesta(p.numApuesta);
		this.setListaNum(p.listaNum);
		this.setAciertos(p.aciertos);
	}

	public int[] getListaNum() {
		return listaNum;
	}

	public void setListaNum(int[] listaNum) {
		this.listaNum = listaNum;
	}

	public int getAciertos() {
		return aciertos;
	}

	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}
	
	@Override
	public void mostrarApuesta() {
		super.mostrarApuesta();
		System.out.println("Los números de su apuesta son:" + this.getListaNum());
		System.out.println("Nº de aciertos: "+ this.getAciertos());
	}
	
	public Primitiva crearPrimitiva() {
		super.crearApuesta();
		Scanner input = new Scanner(System.in);
		int[] listaNum = new int[6];
		for (int i = 0; i <= listaNum.length; i++) {
			System.out.println("Introduzca la apuesta "+ i +" de 6: ");
			listaNum[i] = input.nextInt();
			input.nextLine();
		}
		int aciertos = 0;
		Primitiva p = new Primitiva(nombre, apellido, numApuesta, listaNum, aciertos);
		
		return p;
	}
	
	
}
