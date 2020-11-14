import java.util.Scanner;

public class WetShark42
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any S Value ?  ?");
		int value=sc.nextInt();
		int result=shark(value);
		System.out.println("Value Of S : " + result);
		
		
	}

	private static int shark(int s)
	{
		if(s%2==0)
		{
			return s*2;
		}else
		{
		return s*2+2;
	}
 }

}
