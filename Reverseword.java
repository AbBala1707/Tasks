package Design;
import java.util.Scanner;
public class Reverseword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int temp=s.length();//welcome to java
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==' ' || i==0)
			{
				int j=(i==0)?i:i+1;
				while(j<temp)
				{
					System.out.println(s.charAt(j));
					j++;
				}
				System.out.println(" ");
				temp=i;
			}
		}

	}

}
