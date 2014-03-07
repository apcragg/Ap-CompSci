package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

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
	
	public int sumRow(int r)
	{
		int sum = 0;
		
		for(int i = 0; i < array[r].length; i++)
			sum += array[r][i];
			
		return sum;
	}
	
	public int sumCol(int c)
	{
		int sum = 0;
		
		for(int i = 0; i < array.length; i++)
			sum += array[i][c];
			
		return sum;
	}
	
	public int sumMain()
	{
		int sum = 0;
		
		for(int i = 0; i < Math.min(array[0].length, array.length); i++)
			sum += array[i][i];
			
		return sum;
	}
	
	public int sumMinor()
	{
		int sum = 0;
		int min = Math.min(array[0].length, array.length);
		
		for(int i = 0; i < min; i++)
			sum += array[min - 1 - i][i];
		
		return sum;
	}
	
	public int median()
	{
		ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
		
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				sortedArrayList.add(array[i][j]);
		
		Collections.sort(sortedArrayList, new Comparator<Integer>()
				{
					public int compare(Integer o1, Integer o2)
					{
						return o1 - o2;
					}	
				});

		return sortedArrayList.get((sortedArrayList.size() / 2));
	}
	
	public int mode()
	{
		HashMap<Integer, Integer> modes = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
			{
				int num = array[i][j];
				
				if(modes.containsKey(num)) modes.put(num, modes.get(num) + 1);
				else modes.put(num, 1);
			}
		
		int mode = array[0][0];

		for(Integer m : modes.keySet())
		{	
			int count = modes.get(m);
			int modeCount = modes.get(mode);
			
			if(count > modeCount || (modeCount == count && mode > m)) mode = m;
		}
		
		return mode;
	}
	
	public void print()
	{
		System.out.println("=======Array========");
		
		for(int i = 0; i < x; i++)
		{
			System.out.print("[");
			
			for(int j = 0; j < y; j++)
				System.out.print((array[i][j] >= 0 ? " " : "") + array[i][j] + (j + 1 == y ? "" : ", "));
			
			System.out.println("]");
		}
	}
}
