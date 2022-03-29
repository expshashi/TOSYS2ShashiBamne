
public class PassingObjectTest {

	public static void main(String[] args) 
	{
		Person perobj1=new Person(29,"Shashi",'M');
		Person perobj1=new Person(32,"Mahesh",'M');
	Destination dest= new tr
	}

}

class Person
{
	int age;
	String name;
	char gender;
	public Person(int age, String name, char gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	class Train
	{
		int trainNumber;
		String trainName;
		

		Destination travel(Person x,Person y,String ct,String st,String cont,int pn)
		{
			System.out.println("I am travelling"+x.getName() +"with"+y.getName());
			Destination dest=new Destination(x, y, ct, st,cont,pn);
			return dest;
		}
		
	}

	class Destination
	{
		String city;
		String state;
		String country;
		int pin;
		public Destination(String city, String state, String country, int pin) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.pin = pin;
		}
		@Override
		public String toString() {
			return "Destination [city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getPin() {
			return pin;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		
		
	}
	
	
}


