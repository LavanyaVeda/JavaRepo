package rest.rest.b4;

public class Employ {
	int empId;
	String empname;
	double salary;
	
	
	public Employ(int empId, String empname, double salary ) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.salary = salary;
		
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Id: " + empId  + " Name" +empname+ "Salary:" +salary+"<br>" ;
	}
	
	

}
