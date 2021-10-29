package Design;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		String s=sc.nextLine();
		System.out.println("Enter second number");
		String s1=sc.nextLine();
		int count=s.length(),n=0,n1=0,a=0;
		if(s.length()==s1.length())
		{
		while(s.length()>0)
		{
			String s3="",s2="";n=0;n1=0;a=0;
				for(int j=0;j<s1.length();j++)
				{
					if(s.charAt(n)==s1.charAt(j))
					{
						a++;
						count--;
						n1=j;
						break;
					}
				}
				for(int k=0;k<s.length();k++)
				{
					if(n!=k)
					{
						s2=s2+s.charAt(k);
					}
					if(n1!=k)
					{
						s3=s3+s1.charAt(k);
					}
				}
				s=s2;
				s1=s3;
			if(a==0)
			{
				break;
			}
		}
		}
		if(count==0)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
	}

}
