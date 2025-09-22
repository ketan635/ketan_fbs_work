class Employee{
	int empId;
	String empName;
	double salary;
	Employee() {    //Default Constructor
		this.empId=101;
		this.empName="chaitanya";
		this.salary=20000;
			}
	Employee(int emp_id, String emp_name, double salary) {
		super();
		this.empId = emp_id;
		this.empName = emp_name;
		this.salary = salary;
	}
	int getEmpId() {
		return empId;
	}
	void setEmpId(int empId) {
		this.empId = empId;
	}
	String getEmpName() {
		return empName;
	}
	void setEmpName(String empName) {
		this.empName = empName;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	void display()
	{
		System.out.println("ID:"+this.empId);
		System.out.println("empName:"+this.empName);
		System.out.println("salary:"+this.salary);
	}
	
}//Employee ends here
class SalaManager extends Employee{
	double incentiv;
	int target;
	SalaManager() {
		super();
		this.incentiv=2.5;
		this.target=10;
	}
	SalaManager(int empId,String name,double salary,double incentiv, int target) {
		super(empId,name,salary);
		this.incentiv = incentiv;
		this.target = target;
	}
	double getIncentiv() {
		return incentiv;
	}
	void setIncentiv(double incentiv) {
		this.incentiv = incentiv;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	void display()
	{
		super.display();
		System.out.println("Insentiv:"+this.incentiv);
		System.out.println("salary:"+this.target);
	}
	
	
}
class HRManager extends Employee{
	double commition;

	HRManager() {
		super();
		this.commition=2000;
	}

	HRManager(int empId,String name,double salary,double commition) {
		super(empId,name,salary);
		this.commition = commition;
	}

	double getCommition() {
		return commition;
	}

	void setCommition(double commition) {
		this.commition = commition;
	}
	void display()
	{
		super.display();
		System.out.println("Commition:"+this.commition);
		
	}

	
	
}//HRManager class ends here
class Admin extends Employee{
	double allowenc;

	Admin() {
		super();
		this.allowenc=6000;
	}

	Admin(int empId,String name,double salary,double commition) {
		super(empId,name,salary);
		this.allowenc = allowenc;
	}

	double getallowenc() {
		return allowenc;
	}

	void setallowenc(double allowenc) {
		this.allowenc = allowenc;
	}
	void display()
	{
		super.display();
		System.out.println("allowenc:"+this.allowenc);
		
	}

	
	
}

class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.display();
		
		Employee e2=new Employee(102,"ketan",20000);
		e2.display();

		SalaManager sm1=new SalaManager();
		sm1.display();
		
		SalaManager sm2=new SalaManager(104,"sarthak",24000,5.0,44);
		sm2.display();

		HRManager h1=new HRManager();
		h1.display();
		
		HRManager h2=new HRManager(100,"pramod",28888,100.0);
		h2.display();
		
		Admin a1=new Admin();
		a1.display();
		
		Admin a2=new Admin(107,"cketan",24000,2900.0);
		a2.display();


	}

}