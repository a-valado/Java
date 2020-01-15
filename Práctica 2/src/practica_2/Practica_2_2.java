package practica_2;

public class Practica_2_2 {
	public void crearArray5x5() {
		int [] [] array5x5 = new int [5] [5];
		int i, j;
		for (i = 0; i < array5x5.length; i ++) {
			for (j=0; j < array5x5[1].length; j++) {
				array5x5[i][j] = i+j;
			}
		}
		for (i = 0; i< array5x5.length; i ++) {
			System.out.println();
			for (j = 0; j< array5x5[1].length; j ++) {
				System.out.print(array5x5[i][j]);
			}
		}
	}
}
