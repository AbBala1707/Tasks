package tasks;

import java.util.Scanner;

public class Switchpro {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n/10)
		{
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
			System.out.println("Grade B");
			break;
		case 7:
			System.out.println("Grade C");
			break;
		case 6:
			System.out.println("Grade D");
			break;
		case 5:
			System.out.println("Grade E");
			break;
		default:
			System.out.println("Fail");
		}
	}

}
