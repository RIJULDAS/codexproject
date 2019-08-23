class Question7
{
     static boolean isPrime(long i)
    {
        if(i==2)
            return true;
        if(i%2==0)
            return false;
           for(int j=3; j*j<=i; j++)
        {
            if(i%j==0)
                return false;
            }
        return true;
    }
    public static void main(String args[])
    {
        int count=1;
        long i=2, lp=-1;
        while(count<=10001)
        {
             if(i%2!=0)
             {
            if(isPrime(i))
            {
                lp=i;
                count++;
            }
            i++;
             }
        }
        System.out.println(lp);
    }
}
