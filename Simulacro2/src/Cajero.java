import java.util.ArrayList;
import java.util.Scanner;

public class Cajero {
	private int id_cajero_ultimo;
	private int id_cajero;
	private int[][] lista_billetes;
	private ArrayList <Tarjeta> lista_tarjetas;
	
	public Cajero() {
		
	}
		
	public Cajero(int id_cajero_ultimo, int id_cajero, int[][] lista_billetes, ArrayList <Tarjeta> lista_tarjetas) {
		this.setId_cajero_ultimo(id_cajero_ultimo);
		this.setId_cajero(id_cajero);
		this.setLista_billetes(lista_billetes);
		this.setLista_tarjetas(lista_tarjetas);
	}
	
	public Cajero (Cajero c1) {
		this.setId_cajero_ultimo(c1.id_cajero_ultimo);
		this.setId_cajero(c1.id_cajero);
		this.setLista_billetes(c1.lista_billetes);
		this.setLista_tarjetas(c1.lista_tarjetas);
	}

	public int getId_cajero_ultimo() {
		return id_cajero_ultimo;
	}

	public void setId_cajero_ultimo(int id_cajero_ultimo) {
		this.id_cajero_ultimo = id_cajero_ultimo;
	}

	public int getId_cajero() {
		return id_cajero;
	}

	public void setId_cajero(int id_cajero) {
		this.id_cajero = id_cajero;
	}

	public int[][] getLista_billetes() {
		return lista_billetes;
	}

	public void setLista_billetes(int[][] lista_billetes) {
		this.lista_billetes = lista_billetes;
	}

	public ArrayList<Tarjeta> getLista_tarjetas() {
		return lista_tarjetas;
	}

	public void setLista_tarjetas(ArrayList<Tarjeta> lista_tarjetas) {
		this.lista_tarjetas = lista_tarjetas;
	}
	
	
	public void sacarDinero() {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca su NIF: ");
		String pedirNif = input.nextLine();
		System.out.println("Introduzca su PIN: ");
		int pedirPin = input.nextInt();
		input.nextLine(); //Línea vacía para que el retorno de carro no se coma el int.
		for (int i=0; i < this.getLista_tarjetas().size(); i++) {
			if (pedirNif == this.getLista_tarjetas().get(i).getNif() && pedirPin == this.getLista_tarjetas().get(i).getPin()) {
				System.out.println("Introduzca la cantidad que quiere retirar: ");
				int cantidad = input.nextInt();
				input.nextLine();
				if (this.getLista_tarjetas().get(i) instanceof T_debito) {
					//Comprobamos que la cantidad sea menor o igual que el saldo.
					if (cantidad <= ((T_debito) this.getLista_tarjetas().get(i)).getSaldo()) {
						//Comprobamos que el cajero posee los billetes necesarios para retirar la cantidad
						if (comprobarBilletes(cantidad)) {
							//Disminuimos el saldo
							((T_debito) this.getLista_tarjetas().get(i)).disminuirSaldoDisponible(cantidad);
						}
						
					}
				}
				else { //Al solo existir dos tipos de tarjetas, si no es de un tipo, será del otro.
					//comprobamos si la cantidad es igual o inferior a la suma del saldo y el credito.
					if (cantidad <= (((T_credito) this.getLista_tarjetas().get(i)).getSaldo() + ((T_credito) this.getLista_tarjetas().get(i)).getCredito())) {
						//Comprobamos que el cajero posee los billetes necesarios
						if(comprobarBilletes(cantidad)){
							((T_credito) this.getLista_tarjetas().get(i)).disminuirSaldoDisponible(cantidad);
						}
					}
					
				}
				
			}
		}
		
	}
	public static boolean comprobarBilletes(int cantidad) {
		return true;
		
	}

}
