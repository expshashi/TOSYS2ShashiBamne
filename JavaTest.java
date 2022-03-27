public class JavaTest {

	public static void main(String[] args) 
{
		TwoWheeler tw1 = new TwoWheeler("blue",4567,"Honda");
		Bike b1= new Bike("yellow",9876,"SUZUKI",55.6);
		SuperBike sp1= new SuperBike("Red",1234,"Pulsar",88,100);
		
System.out.println("This is two wheeler  tw1 "+tw1);

System.out.println("This is bike  b1 "+b1);	

System.out.println("This is Superbike  sp1 "+sp1);	

		tw1.Start();
		tw1.Stop();

	}
}

class TwoWheeler {
	String colour;
	int regNumber;
	String modelType;

	void setTwoWheeler(String colour, int regNumber, String modelType)
	{
		this.colour = colour;
		this.regNumber = regNumber;
		this.modelType = modelType;
	}



	public TwoWheeler(String colour, int regNumber, String modelType) {
		super();
		this.colour = colour;
		this.regNumber = regNumber;
		this.modelType = modelType;
	}



	@Override
	public String toString() 
	{
		return "TwoWheeler [colour=" + colour + ", regNumber=" + regNumber + ", modelType=" + modelType + "]";
	}


	void Start() {

		System.out.println("TwoWheeler is starting");

	}

	void Stop() {

		System.out.println("TwoWheeler is stoping");

	}
}

class Bike extends TwoWheeler
{
	double milege;

	public Bike(String colour, int regNumber, String modelType, double d)
	{
		super(colour, regNumber, modelType);
		this.milege = d;
	}

	@Override
	public String toString() {
		return "Bike [milege=" + milege + ", colour=" + colour + ", regNumber=" + regNumber + ", modelType=" + modelType
				+ "]";
	}
	
	
}

class SuperBike extends Bike
{
	double highspeed;
	


	public SuperBike(String colour, int regNumber, String modelType, double milege, double highspeed) {
		super(colour, regNumber, modelType, milege);
		this.highspeed = highspeed;
	}



	@Override
	public String toString() {
		return "SuperBike [highspeed=" + highspeed + ", milege=" + milege + ", colour=" + colour + ", regNumber="
				+ regNumber + ", modelType=" + modelType + "]";
	}
	

	
}


