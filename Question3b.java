    
class Question3b
{
	public static void main(String[] args)
	{
		int i;
		long n=600851475143L;
		for ( i = 2; i <= n; i++)
		{
			if (n % i==0)
			{
				
				break;
				
			}
		}
		System.out.println(i);
}
}