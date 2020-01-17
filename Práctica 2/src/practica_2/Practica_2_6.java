package practica_2;

public class Practica_2_6 {
	public void crearMarco() {
		int [][] array8x6 = new int [8][6];
		int i, j;
		for (i=0; i<8; i++) {
			for (j=0; j<6; j++) {
				if (i==0) {array8x6[i][j] = 1;}
				else if (j == 0) {array8x6[i][j] = 1;}
				else if (j == 5) {array8x6[i][j] = 1;}
				else if (i==7) {array8x6[i][j] = 1;}
				else {array8x6[i][j] = 0;}
			}
		}
		for (i=0; i<8; i++) {
			System.out.println();
			for (j=0; j<6; j++) {
				System.out.print(array8x6[i][j]);
			}
		}
	}
}
