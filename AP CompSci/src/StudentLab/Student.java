package StudentLab;

import java.io.File;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Student
{
	private static ArrayList<String> students;
	private File file;
	private FileReader f_reader;
	private BufferedReader b_reader;

	public static void main(String[] args)
	{
		new Student();
		
		printList(students);
		
		System.out.println("Size of the list of students: " + students.size());
		
		//Adds a list of new Students
		addArray(students, new String[] {"Carly", "Samuel", "Peter", "Christina", "Austin", "Jon", "Brooke", "Ava"});
				
		System.out.println("======List with added names======");
		printList(students);
			
		//removes names starting with P
		removeCh(students, 'P');
				
		System.out.println("======List with names starting with P removed======");
		printList(students);
		
		//removed duplicates
		removeDup(students);
		
		System.out.println("======List with duplicates removed======");
		printList(students);
		
		//replaces Brian with Brady
		
		replaceName(students, "Brian", "Brady");
		
		System.out.println("======List with Brian replaced with Brady======");
		printList(students);
	}
	
	public Student()
	{
		students = new ArrayList<String>();
		file = new File(System.getProperty("user.dir") + "/students.txt");
		
		try
		{
			f_reader = new FileReader(file);
			b_reader = new BufferedReader(f_reader);
			
			String line;
			
			while((line = b_reader.readLine()) != null)
			{
				readLine(line);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}			
	}
	
	private void readLine(String s)
	{
		Pattern p = Pattern.compile("\\d+\\.\\s*(.*)");
		Matcher matcher = p.matcher(s);
		
		if(matcher.find())
		{
			students.add(matcher.group(1));
		}
	}
	
	public static void printList(ArrayList<String> x)
	{
		int count = 1;
	
		for(String s : x)
		{
			System.out.println(count++ +". " + s);
		}
	}
	
	public static void removeCh(ArrayList<String> list, char ch)
	{
		Iterator<String> i = list.iterator();
		
		while(i.hasNext())
		{
			if(ch == i.next().charAt(0))
				i.remove();
		}
	}
	
	public static void addArray(ArrayList<String> list, String[] names)
	{
		list.addAll(Arrays.asList(names));
		
		/* or if that isn't allowed */
		
		//for(int i = 0; i < list.size(); i++)
		//	list.add(names[i]);
	}
	
	public static void replaceName(ArrayList<String> list, String replaced, String replacer)
	{
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).equals(replaced))
			{
				list.set(i, replacer);
			}
		}
		
	}
	
	public static void removeDup(ArrayList<String> list)
	{
		List<String> names = new ArrayList<String>();
		
		Iterator<String> i = list.iterator();
		
		while(i.hasNext())
		{
			String temp = i.next();
			
			if(!names.contains(temp))
				names.add(temp);
			else
				i.remove();
		}
	}
	
}