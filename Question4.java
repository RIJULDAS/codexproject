import java.io.*;
class Question4
{
static  boolean checkpallindrome(int n)
{
 int x,s=0,t;     
  t=n;    
  while(n>0)
  {
   x=n%10;    
   s=(s*10)+x;    
   n=n/10;    
  }    
  if(t==s)    
   return true;    
  else    
   return false;    
} 
public static void main(String args[]){
int a=0;
int b=0;
int c=0;
int d=0;
int m=-1;
for(a=100;a<1000;a++)
{
 for(b=100;b<1000;b++)
 {
   c=a*b;
   if((c>m)&(checkpallindrome(c)))
   m=c; 
 }
}
System.out.println(m);
 }
}