import java.util.Scanner;
public class WeightedMean 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Xi Length ?");
		int xiLength=sc.nextInt();
		int xiArray[]=new int[xiLength];
		for(int i=0;i<xiArray.length;i++)
		{
			xiArray[i]=sc.nextInt();
		}
		System.out.println("Enter wi Length ?");
		int wiLength=sc.nextInt();
		int wiArray[]=new int[wiLength];
		for(int j=0;j<wiArray.length;j++)
		{
			wiArray[j]=sc.nextInt();
		}
		double result=weightedMean(xiArray,wiArray);
		System.out.println("Weighted Mean = " + result);
	}

	private static double weightedMean(int[] xi, int[] wi)
	{
		double wsum=0.0;
		for(int i=0;i<wi.length;i++)
		{
			wsum=wsum+wi[i];
		}
		double wmean=0.0;
		for(int j=0;j<xi.length;j++)
		{
			wmean=wmean+xi[j]*wi[j];
		}
		wmean=wmean/wsum;
		return (double)wmean;
	//	System.out.println(wmean);
	}
}
/*
Enter Xi Length ?
5
10
40
30
50
20
Enter wi Length ?
5
1
2
3
4
5
32.0
*/
