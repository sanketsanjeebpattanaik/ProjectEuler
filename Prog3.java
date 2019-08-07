public class Prog3
  {
    public static void main(string [] args)
      {
        long num=600851475143L;
        int i=2;
        for(;i<=num;i++)
          {
            while(num%i==0)
              {
                num=num/i;
              }
          }
         system.out.println("The largest prime factor of the number 600851475143="+(i-1));
       }
    }
