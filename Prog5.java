public class Prog5
{
    public static void main ()
    {
        int flag=0,n=21,i;
        while (flag!=1)
        {
            
            for(i=1;i<=20;i++)
            {
                if(n%i!=0)
                {
                    flag=1;
                    break;
                }
                
            }
            if(flag==0)
            {
                System.out.println("Smallest multiple ="+n);
                break;
            }
            n++;
            flag=0;
        }
    }
}
    
