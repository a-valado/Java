package practica_5;
//Import
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		boolean menu = true;
		ArrayList <Empleado> Trabajadores = new ArrayList <Empleado>();
		
		while (menu == true) {
			System.out.println(" ");
			System.out.println("**** Práctica 5-1 ****");
			System.out.println("Escoja una opción");
			System.out.println("1) Dar de alta un empleado regular");
			System.out.println("2) Dar de alta un repartidor");
			System.out.println("3) Dar de alta un comercial");
			System.out.println("4) Mostrar empleados");
			System.out.println("99) Salir");
			int opcion = lector.nextInt();
			
			switch (opcion) {
			case 1:
				Empleado e1 = new Empleado ();
				e1.pedirAlta();
				Trabajadores.add(e1);
				break;
			case 2:
				Repartidor r1 = new Repartidor();
				r1.pedirAlta();
				Trabajadores.add(r1);
				break;
			case 3:
				Comercial c1 = new Comercial();
				c1.pedirAlta();
				Trabajadores.add(c1);
				break;
			case 4:
				for (int i = 0; i<Trabajadores.size(); i++) {
					if (Trabajadores.get(i) instanceof Repartidor) {
						((Repartidor) Trabajadores.get(i)).mostrarAtributos();
					} else if (Trabajadores.get(i) instanceof Comercial) {
						((Comercial) Trabajadores.get(i)).mostrarAtributos();
					} else if (Trabajadores.get(i) instanceof Empleado) {
						Trabajadores.get(i).mostrarAtributos();
					}
				}
				break;
			case 99:
				menu = false;
				break;
			}
		}
	}

}
