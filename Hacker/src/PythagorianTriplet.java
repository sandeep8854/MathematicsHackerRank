
public class PythagorianTriplet 
{
	public static void main(String[] args)
	{
		int limit=20;
		pythagoreanTriplet(limit);
	}

	private static void pythagoreanTriplet(int limit) 
	{
		int a,b,c=0;
		int m=2;
		while(c<limit)
		{
			for(int i=1;i<m;i++)
			{
				a=m*m-i*i;
				b=2*m*i;
				c=m*m+i*i;
				if(c>limit)
					break;
				System.out.println(a +" "+b+ " "+c);
			}
			m++;
		}
	}
	

}
