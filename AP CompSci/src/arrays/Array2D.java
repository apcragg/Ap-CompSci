package arrays;

import java.util.Arrays;

/*
 * Author:       Andrew Cragg
 * Date Created: Mar 6, 2014
 */

public class Array2D
{
	private int[][] array;
	private int x, y;
	
	public Array2D(int[][] a)
	{
		this.x = a.length;
		this.y = a[0].length;
		this.array = a.clone();
	}
	
	public int min()
	{
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				min = min < array[i][j] ? min : array[i][j]; 
		
		return min;
	}
	
	public int max()
	{
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				max = max > array[i][j] ? max : array[i][j]; 
		
		return max;
	}
	
	public double average()
	{
		double sum = 0;
		
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				sum += array[i][j];
		
		return sum / (double) (x * y);
	}
	
	public void biggerThanAverage()
	{
		System.out.print("Bigger than average: ");
		
		double average = average();
		
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				if((double) array[i][j] > average) System.out.print(array[i][j] + ", ");
				
		System.out.println();
	}
	
	public int closestToZero()
	{
		int close = Integer.MAX_VALUE;
		
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				close = Math.abs(close) <= Math.abs(array[i][j]) ? close : array[i][j]; 
		
		return close;
	}
	
	public void print()
	{
		for(int i = 0; i < x; i++)
		{
			System.out.print("[");
			
			for(int j = 0; j < y; j++)
				System.out.print(array[i][j] + (j + 1 == y ? "" : ", "));
			
			System.out.println("]");
		}
	}
	
	public static void main(String[] args)
	{
		int[][] temp = new int[5][5];
		
		for(int i = 0; i < 5; i++)
			for(int j = 0; j < 5; j++)
				temp[i][j] = (int) ((((Math.random()) * 9f) - 4.5f) * 2);
				
		Array2D array2d = new Array2D(temp);
		
		array2d.print();
		System.out.println("Max: " + array2d.max());
		System.out.println("Min: " + array2d.min());
		System.out.println("Average: " + array2d.average());
		array2d.biggerThanAverage();
		System.out.println("Closest to zero: " + array2d.closestToZero());
	}
}
