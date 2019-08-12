public class prog10
{
    public static void main()
    {
        int i=0,j=0,ctr=0,sum=0;
        for(i=1;i<=2000000;i++)
        {
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    ctr++;
                }
            }
            if(ctr==2)
            {
                sum=sum+i;
            }
            ctr=0;
        }
        System.out.println("The sum of all the primes below two million="+sum);
    }
}
