package tasks;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]= {"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		for(int i=0;i<s.length;i++)
		{
			if(i!=0)
			System.out.println(s[i]);
		}
		System.out.println("Enter number from 1 to 7 for choose a day");
		int n=sc.nextInt();
		System.out.println(s[n]);

	}

}
