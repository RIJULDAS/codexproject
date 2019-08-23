 
 class Question5
 {
 
    public static void main(String[] args)
    {
        
        
              long c = 21;
              while (1==1)
    {
             boolean mul = true;
          for (int i = 1; i < 21; i++)
    {
        mul = true;
        if ( c % i != 0 )
        {
            mul = false;
            break;
        }
    }
       if ( mul )
    {
        System.out.println( c );
        System.exit(21);
    }

    c++;
}
}
}
