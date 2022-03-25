
public class ASSIGNEMENTDAY4 {

	public static void main(String[] args)
	{
		Person prsobj1= new Person("SHASHI",'M');
		ReportCard rp1=prsobj1.giveExam();
	}
}

	
class Person
{
	String name;
    char gender;
    Vehicle v1= new Vehicle();
    Laptop Lp1= new Laptop();
    Book b1=new Book();
    Guitar gt1=new Guitar();
    Shirt shirtobj1= new Shirt();
    
    
    ReportCard giveExam()
   
    {
    	ReportCard rpobj=new ReportCard();
    }
    
	
    
	public Person(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
}
	
	class 	Buliding
	{
		int floors;
		String area;
		String Location;
		String address;
		public Buliding(int floors, String area, String location, String address) {
			super();
			this.floors = floors;
			this.area = area;
			Location = location;
			this.address = address;
		}
		
	}
	
	class HolidayHome extends Buliding
	{
		
	}
	class Hotel	extends Buliding
	{
	}
	
	class Restaurant	extends Buliding
	{
		
	}
	
	
class Vehicle
{
	int regNO;
	String Type;
	String noOfWheels;
	String colour;
	public Vehicle(int regNO, String type, String noOfWheels, String colour) {
		super();
		this.regNO = regNO;
		Type = type;
		this.noOfWheels = noOfWheels;
		this.colour = colour;
	}
	
	
	
	
}
    
   class TwoWheeler extends Vehicle
   {
	   
   }

   class Laptop
   {
   }
   class Book
   {
   }
   
   class Toy
   {
	   
   }
class Guitar
{
}
class Shirt
{
	
}
class Exam
{
}
class ReportCard
{
}




