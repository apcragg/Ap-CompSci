package back_to_school;

public class BackToSchool
{
	public BackToSchool()
	{
		run();
	}
	
	private void run()
	{
		Person archer = new Person("Sterling Archer", 29, "M");
		System.out.println(archer);

		Student austin = new Student("Austin Vassallo", 18, "M", "1BA2389AC", 3.55);
		System.out.println(austin);

		Teacher scheidler = new Teacher("Krysten Shceidler", 28, "F", 650000, "Physics");
		System.out.println(scheidler);

		CollegeStudent mackenzie = new CollegeStudent("Mackenzie Maison", 19, "M", "VT2014",
		                                         4.0, "Biology", 1);
		System.out.println(mackenzie);

	}

	public static void main(String vmArgs[])
	{
		new BackToSchool();
	}
}