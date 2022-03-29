import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ObjectArrayTest 
{

	public static void main(String[] args) 
	{
		
		//ArrayList<Employee> staff = new ArrayList<Employee>();
		//LinkedList<Employee> staff = new LinkedList<Employee>();
		//HashSet<Employee> staff = new HashSet<Employee>();
		TreeSet<Employee> staff = new TreeSet<Employee>();
		Employee e1= new Employee(106,"Arshad",5000);
		System.out.println("Trying to add first object");
		staff.add(new Employee(103,"Rajendra",8000));
		System.out.println("Trying to add second object");
		staff.add(new Employee (104,"Tuhin",9000));
		System.out.println("Trying to add third object");
		staff.add(new Employee(105,"Shashi",7000));
		System.out.println("Trying to add fourth object");
		staff.add(e1);
		
		Iterator<Employee> iterator = staff.iterator();
		while(iterator.hasNext())
		{
			Employee theEmp= iterator.next();
			System.out.println("employee"+theEmp);
			
		}
		
		
		
	//
	// for(int i=0;i<staff.length;i++)
//	 {
	//	 System.out.println(staff[i]);
//	 }

	}
}

	class  Employee implements Comparable<Employee>
	{
		int empId;
		String Name;
		float salary;
		public Employee(int empId, String name, float salary) {
			super();
			this.empId = empId;
			Name = name;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", Name=" + Name + ", salary=" + salary + "]";
		}
		@Override
		public int compareTo(Employee o) {
			System.out.println("Comparing"+empId +" with "+ o.empId);

			return Integer.compare(empId, o.empId);
		}
		
		
	}

