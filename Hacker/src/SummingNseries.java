import java.util.Scanner;

public class SummingNseries
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ");
		int number=sc.nextInt();
		long result=summingNSeries(number);
		System.out.println("Sum Of Series : " +result);	
	}

	private static int summingNSeries(int N) 
	{
		/*int p = 1000000007;
        int  sum=((N%p)*(N%p))%p;
		return sum;		*/
		int j=0;
		for(int i=1; i<=N;i++)
		{
			if(N%i==0)
				j=i*i;		
		}
		return j;
	}
}
/*
Enter Any Number ? 
5
Sum Of Series : 25
*/
