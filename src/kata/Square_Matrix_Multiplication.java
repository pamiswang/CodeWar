package kata;

public class Square_Matrix_Multiplication {

    public static void main(String[] args) {
	System.out
		.println(matrixMultiplication(new int[][] { { 1, 2 }, { 3, 2 } }, new int[][] { { 3, 2 }, { 1, 1 } }));

	System.out.println(matrixMultiplication(new int[][] { { 1, 2, 3 }, { 3, 2, 1 }, { 2, 1, 3 } },
		new int[][] { { 4, 5, 6 }, { 6, 5, 4 }, { 4, 6, 5 } }));

    }

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {

	int[][] c = new int[a.length][b[0].length];
	int temp = 0;
	for (int arow = 0; arow < a.length; arow++) {// arow
	    for (int bcol = 0; bcol < b[0].length; bcol++) {// bcol
		temp = 0;
		for (int brow = 0; brow < b.length; brow++) {// brow
		    temp = temp + (a[arow][brow]) * (b[brow][bcol]);// acol=brow
		}
		c[arow][bcol] = temp;
		System.out.print("c[" + arow + "],[" + bcol + "]=" + c[arow][bcol] + " ");
	    }
	    System.out.println();
	}
	return c;
    }
}
