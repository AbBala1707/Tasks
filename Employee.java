package Design;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		character();
	}
	static void character()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Letter :");
		char ch=sc.next().charAt(0);
		System.out.println("Enter Second Letter :");
		char ch1=sc.next().charAt(0);
		System.out.println("Enter Third Letter :");
		char ch2=sc.next().charAt(0);
		System.out.println(ch2+""+ch1+""+ch);
	}

}
