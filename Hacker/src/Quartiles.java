import java.util.Arrays;
import java.util.Scanner;

public class Quartiles 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length ?");
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(N%2==0)
		 {
	        System.out.println(median(arr, N / 2, N - 1));
	    }
	     else
	     {
	        System.out.println(median(arr, N / 2 + 1, N - 1));
	     }
		System.out.println(median(arr,0,N/2-1));
		System.out.println(median(arr,0,N-1));
	}

	private static int median(int[] arr, int start, int end)
	{
		int length=(end-start)+1;
		int median=0;
		if(length%2!=0)
		{
			median=arr[start+length/2];
		}
		else
		{
			median= (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
		}
		return median;
	}
}
/*
 * Enter Any Length ?
9
13
13
13
13
14
14
16
14
21
13
14
15
*/
	
