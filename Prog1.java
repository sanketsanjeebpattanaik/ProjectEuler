public class Prog1
{
  public static void main(String [] args)
   {
      int i=0,sum=0;
      for(i=0;i<1000;i++)
        {
          if(i%3==0 || i%5==0)
            {
              sum=sum+i;
            }
        }
        System.out.println("Sum of all the multiples of 3 or 5 below 1000 ="+sum);
    }
 }
