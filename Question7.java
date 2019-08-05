class Question7
{
  public static void main(String args[])
  {
     int i,a=0,d=0;
    for(i=2;a<=10000;i++ )
    {
        for(int j=2;j<=i/2;j++)
        {
         if (i%j==0)
         d++;
         }
         if(d==0)
         {
           a++;
         }
         d=0;
         }
         System.out.println(i-1);
         }
         }