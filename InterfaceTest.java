
public class InterfaceTest {

	public static void main(String[] args)
	{
		Person P1= new Person("Shashi");
		P1.waking(10);
		P1.sleeping(12, 7);

	}

}

interface waking
{
	void waking(int whatTime);
}

interface sleeping
{
	void sleeping(int whatTime,int howLong);
}

class Person implements waking,sleeping
{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public void sleeping(int whatTime, int howLong) {
		
		System.out.println(name+"person is sleeping at "+whatTime+ "for"+ howLong);
	}

	@Override
	public void waking(int whatTime)
	{
		System.out.println(name+"person is waking at "+whatTime);
		
	}
	
	
	
	
}