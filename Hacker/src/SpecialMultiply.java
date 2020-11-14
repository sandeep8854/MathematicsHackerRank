import java.util.Scanner;
public class SpecialMultiply
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value Of T ? ");
		int T=sc.nextInt();
		while(T!=0)
		{
			System.out.println("Enter N Number ?");
			int N=sc.nextInt();
			int i=1;
			while(true)
			{
				long num=Long.parseLong(Integer.toBinaryString(i).replace("1", "9"));
				if(num%N==0)
				{
					System.out.println(num);
					break;
				}
				i++;
			}
			T--;
		}
	}
}
/*
Enter The Value Of T ? 
3
Enter N Number ?
5
90
Enter N Number ?
7
9009
Enter N Number ?
1
9
*/
