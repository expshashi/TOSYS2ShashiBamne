import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class Employee 
{
@Id
@Column(name="emp_no")
private int employeeNumber;
@Column(name="emp_name", length =20)
private String name;
@Column(name="emp_job",length =20 )
private String job;
@Column(name="emp_doj")
private LocalDate joiningDate;
@Column(name="emp_salary")
private double salary;

public Employee()
{
	super();

}
public int getEmployeeNumber() {
	return employeeNumber;
}
public void setEmployeeNumber(int employeeNumber) {
	this.employeeNumber = employeeNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public LocalDate getJoiningDate() {
	return joiningDate;
}
public void setJoiningDate(LocalDate joiningDate) {
	this.joiningDate = joiningDate;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}



}
