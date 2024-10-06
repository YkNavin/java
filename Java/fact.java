import java.util.*;

class fact
{
    public static int factorial(int n)
    { 
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else 
            return n*factorial(n-1);
    } 
    public static void main(String args[] )
    {
        int n,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no you want to find factorial:");
         n = sc.nextInt();
        f=factorial(n);
        System.out.println("the factorial of given no is:"+f);
    }
}
