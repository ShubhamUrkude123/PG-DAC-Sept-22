

class Pattern21
{
	public static void main(String args[])
	{
		int i;
		int j;

		for(i=1 ; i<=7 ; i++)
		{
			int k=0;
			
			for(j=1 ; j<=i ; j++)
			{
				k^=1;
				System.out.print(k);
			}
			System.out.println();
		}
	}
}

/*
OUTPUT - 
1
10
101
1010
10101
101010
1010101
*/