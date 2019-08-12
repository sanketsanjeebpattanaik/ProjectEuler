public class Prog10
{
    public static void main()
    {
        int i=0,j=0,flag=0;
        double x=0;
        long sum=2;
        for(i=3;i<=2000000;i=i+2)
        {
            x=Math.sqrt(i);
            for(j=3;j<=x;j=j+2)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                sum=sum+i;
                flag=0;
            }
            System.out.println("The sum of all the primes below two million="+sum);
        }
    }
}
