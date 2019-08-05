    
class Question3
{
 public static void main(String[]args)
 {
  long number=600851475143L;
  long newNum;
  for(long i=2;i<=number;i++)
  {
   if (number%i==0)
   {
     newNum=i;
     int c=0;
     for (long j=newNum;j>=1;j--)
     {
       if(newNum%j==0)
       {
         c++;
       }
    }
      if (c==2)
      {
        System.out.println(newNum);
      }
    }
 }
 }
}