class Question2
{
    public static void main(String args[] )
    {
        int firstNumber=1;
        int secondNumber=1;
        int n=0;
        int evenSum=0;
        while (n<400000)
        {
            firstNumber=secondNumber;
            secondNumber=n;
            n=firstNumber=secondNumber;
            if(n%2==0)
            {
                evenSum=evenSum+n;
            }
        }
        System.out.println(evenSum);
    
    }
}
    
    