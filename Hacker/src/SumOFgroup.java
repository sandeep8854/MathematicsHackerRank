import java.util.Scanner;

public class SumOFgroup
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any K value ?  ?");
		int value=sc.nextInt();
		int result=sumOfGroup(value);
		System.out.println("Sum of The Group: " + result);
	}
	private static int sumOfGroup(int k) 
	{
		return k*k*k;	
	}
}
