import java.util.Scanner;

public class PythagoreanTriplet2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a ?  ?");
		int avalue=sc.nextInt();
		triplet(avalue);
	}
	private static void triplet(int a)
	{
		int b,c;
		if(a%2==0)
		{
		   b=a*a/2-1;
		  int temp=b/2;
		       b=temp;
		        c=b+2;
		}
		else
		{
			 b=(a*a)-1/2;
			int temp=b/2;
			     b=temp;
			      c=b+1;
		}	
	System.out.println(a+ " "+ b +" "+c );
	}

}
