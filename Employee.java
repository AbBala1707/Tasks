package Design;

public class Employee {
	String name;
	float salary;
	int age;
	int id;
	public Employee(String Empname,int Empid,float Empsalary,int Empage)
	{
		name=Empname;
		id=Empid;
		salary=Empsalary;
		age=Empage;
	}
	public void get(String name,int id,float salary,int age)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.salary=salary;
	}
	public void print()
	{
		System.out.println("Employee name is "+name);
		System.out.println("Employee age is "+age);
		System.out.println("Employee id is "+id);
		System.out.println("Employee salary is "+salary);
	}
	public static void main(String[] args) {
		Employee e=new Employee("bala",123,25000,22);
		e.print();
		e.get("alice",124,30000,22);
		e.print();
	}

}
