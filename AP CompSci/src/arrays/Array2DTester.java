package arrays;

public class Array2DTester
{
	public static void main(String[] args)
	{
		int[][] temp0 = {{2, 4, -5, 1, 0}, {3, -9, 9, 0, 0},
						 {7, -2, -6, 4, 3}, {1, -4, -5, 1, 8},
						 {5, 6, -7, 2, 3}};
		
		Array2D array2d_0 = new Array2D(temp0);
		
		array2d_0.print();
		System.out.println("Max: " + array2d_0.max());
		System.out.println("Min: " + array2d_0.min());
		System.out.println("Average: " + array2d_0.average());
		array2d_0.biggerThanAverage();
		System.out.println("Closest to zero: " + array2d_0.closestToZero());
		System.out.println("Sum of row 2: " + array2d_0.sumRow(1));
		System.out.println("Sum of col 3: " + array2d_0.sumCol(2));
		System.out.println("Sum of Main diagonal: " + array2d_0.sumMain());
		System.out.println("Sum of Minor diagonal: " + array2d_0.sumMinor());
		System.out.println("Mode: " + array2d_0.mode());
		System.out.println("Median: " + array2d_0.median());
		
		System.out.println('\n');
		
		int[][] temp1 = new int[15][15];
		
		for(int i = 0; i < 15; i++)
			for(int j = 0; j < 15; j++)
				temp1[i][j] = (int) ((Math.random() * 19f)) - 9;
				
		Array2D array2d_1 = new Array2D(temp1);
		
		array2d_1.print();
		System.out.println("Max: " + array2d_1.max());
		System.out.println("Min: " + array2d_1.min());
		System.out.println("Average: " + array2d_1.average());
		array2d_1.biggerThanAverage();
		System.out.println("Closest to zero: " + array2d_1.closestToZero());
		System.out.println("Sum of row 2: " + array2d_1.sumRow(1));
		System.out.println("Sum of col 3: " + array2d_1.sumCol(2));
		System.out.println("Sum of Main diagonal: " + array2d_1.sumMain());
		System.out.println("Sum of Minor diagonal: " + array2d_1.sumMinor());
		System.out.println("Mode: " + array2d_1.mode());
		System.out.println("Median: " + array2d_1.median());
	}
}
