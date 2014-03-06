package arrays;

import java.util.Scanner;

/*
 * Author:       Andrew Cragg
 * Date Created: Mar 6, 2014
 */

public class WorksheetOne
{
	public static void main(String[] args)
	{
		int[][] b = new int[2][4];
		Scanner console = new Scanner(System.in);
		for (int i = b.length-1; i >= 0; i--)
		  for (int j = 0; j < b[0].length; j++)
		  b[i][j] = console.nextInt();

		for (int i = 0; i < b.length; i++)
		{
			  for (int j = 0; j < b[0].length; j++)
				  System.out.println(b[i][j]);

			  System.out.println();
		}
	}
}
