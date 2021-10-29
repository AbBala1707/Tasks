package Design;

import java.util.Scanner;

public class A1B1 {

	public static void main(String[] args) {

		char c=' ';int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i)>=65 && s.charAt(i)<=91)
			{
				c=s.charAt(i);
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
			for(int j=i+1;j<=s.length();j++)
			{
				if(j<s.length() && s.charAt(j)>=48 && s.charAt(j)<=57)
				{
					continue;
				}
				else
				{
					n=n+Integer.parseInt(s.substring(i,j));
					i=j-1;
					while(n>0)
					{
						System.out.print(c);
						n--;
					}
					break;
				}
				
			}
			}
		}sc.close();
			
	}

}
