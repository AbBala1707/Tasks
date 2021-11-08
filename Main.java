class Programmer
{
    void multi(int a,int b)
    {
        System.out.println(a*b);
    }
}
class Employee extends Programmer
{
     void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    Employee e=new Employee();
	    e.add(5,5);
	    e.multi(5,5);
	}
}
