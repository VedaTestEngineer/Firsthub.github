package qsp;

public class Yahoologin
{

	public static void main(String[] args) 
	{
		int num=273481;
		while (num!=0)
		{
			int rem=num%10;
			if (rem==1)
			{
			 rem=7;	
			}
			else if (rem==7)
			{
			 rem=1;
			}
			num=num/10;
		}
		System.out.println (num);

	}

}
