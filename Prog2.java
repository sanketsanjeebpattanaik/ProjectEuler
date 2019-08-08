public class Prog2
  {
    public static void main()
      {
        int sum=0,x=1,y=2;
         while(x<4000000)
         {
            if (x%2==0)
            {
              sum=sum+x;
            }
            y=x+y;
            x=y-x;
          }
         System.out.println("The sum of the even-valued terms="+sum);
      }
   }
