package theory;

public class Matrix
{

	public static void main(String[] args)
	{
//		// TODO Auto-generated method stub
//		int[][] matrix =new int[4][3];
//		for(int i = 0; i<4;i++) {
//			for(int j = 0;j<3;j++) {
//				matrix[i][j] = i+j;
//			}
//		}
//		int n = matrix.length;
//		int m = matrix[0].length;
//		for(int i = 0; i<4;i++) {
//			for(int j = 0;j<3;j++) {
//				System.out.print(matrix[i][j]+ " ");
//			}
//			System.out.println();
//		}
//		System.out.println(n + " " + m);
		int[][] matrix = {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		printSpiralMatrix(matrix);
	}

	private static void printSpiralMatrix(int[][] matrix)
	{
		int startRow = 0;
		int startCol = 0;
		int endRow = matrix.length-1;
		int endCol = matrix[0].length - 1;
		while(startRow <= endRow && startCol<=endCol) {
			//top
			for(int i = startCol ;i<=endCol;i++) {
				System.out.print(matrix[startRow][i]+" ");
			}
			//right
			for(int i = startRow + 1;i<=endRow;i++) {
				System.out.print(matrix[i][endCol]+" ");
			}
			//bottom
			for(int i = endCol-1;i>=startCol;i--) {
				if(startRow == endRow) {
					break;
				}

				System.out.print(matrix[endRow][i]+" ");
			}
			//left
			for(int i = endRow-1;i>=startRow+1;i--) {
				if(startCol == endCol) {
					break;
				}

				System.out.print(matrix[i][startCol]+" ");
			}
			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
		System.out.println();
	}

}
