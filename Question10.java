
class Question10
{
  static boolean isPrime(int a)
  {
    if(a==2)
      return true;
     if(a%2==0)
      return false;
      for(long i=3;i*i<=a;i++)
      {
        if(a%i==0)
         return false;
         }
           return true;
           }
  public static void main(String args[])
  {
    int x=2000000;
    long sum=2;
      for(int i=3;i<=x;i=i+2)
        
       {
          if(isPrime(i)==true)
          {
          sum+=i;
          }
         }
         
         System.out.println("sum of the primes number is ="+sum);
         }
        }
