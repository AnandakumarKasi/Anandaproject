/** This class is to manage student data**/
class Student
{
	short age;
	String name;
	float percentage;
	boolean pass;
	char grade;
}
class TestStudent
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.age = 350;
		s1.name = "Vinodh";
		s1.pass = true;
		s1.grade = 'A';
		s1.percentage = 45.34f;
		System.out.println(s1.age +" "+s1.name+" "+s1.percentage+" "+s1.pass+" "+s1.grade);

	}
}

