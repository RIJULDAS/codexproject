 
 class Question5
 {
 
     static int multiple(int fn,int ln)
    {
        int lcm=0;
      for(int i=1;i<=ln;i++)
      {
       int sn=i;
       if (fn>sn)
        lcm=fn;
        else
        lcm=sn;
        while(true)
        {
          if(lcm%fn==0 && lcm%sn==0)
          {
           fn=lcm;
           break;
        }
        lcm=lcm+1;
       }
      }
      return lcm;
     }
       public static void main(String args[])
       {
        System.out.println(multiple(1,20));
       }
      }
           
        
     
