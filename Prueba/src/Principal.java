import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Practica1_1 p1= new Practica1_1 ();
		Practica1_2 p2= new Practica1_2 ();
		Practica1_3 p3= new Practica1_3 ();
		Practica1_4 p4= new Practica1_4 ();
		Practica1_5 p5= new Practica1_5 ();
		
		System.out.println("Escoja una opción:");
		Scanner leer = new Scanner(System.in);
		int opcion = leer.nextInt();
		switch (opcion) {
			case 1:
				p1.cinco_numeros();
				break;
			case 2:
				p2.orden_inverso();
				break;
			case 3:
				p3.medias();
				break;
			case 4:
				p4.orden_salteado();
				break;
			case 5:
				p5.dos_tablas();
				break;
		}

}
}
