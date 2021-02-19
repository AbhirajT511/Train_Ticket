
public class Passenger 
{
	private String name;
	private static int age;
	private static char gender;
	public Passenger(String name, int age, char gender) 
	{
		super();
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public static int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public static char getGender() 
	{
		return gender;
	}
	public void setGender(char gender) 
	{
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
