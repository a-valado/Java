package practica_2;

public class Practica_2_5 {
	public void crearDiagonal() {
		int [][] array7x7 = new int[7][7];
		int i, j;
		for (i=0; i<7; i++) {
			for (j=0; j<7; j++) {
				if (i==0 && j==0) {array7x7[i][j] = 1;}
				else if (i==1 && j==1) {array7x7[i][j] = 1;}
				else if (i==2 && j==2) {array7x7[i][j] = 1;}
				else if (i==3 && j==3) {array7x7[i][j] = 1;}
				else if (i==4 && j==4) {array7x7[i][j] = 1;}
				else if (i==5 && j==5) {array7x7[i][j] = 1;}
				else if (i==6 && j==6) {array7x7[i][j] = 1;}
				else {array7x7[i][j] = 0;}
			}
		}
		for (i=0; i<7; i++) {
			System.out.println();
			for (j=0; j<7; j++) {
				System.out.print(array7x7[i][j]);
			}
		}
	}
}
