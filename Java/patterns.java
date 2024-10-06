import java.util.*;
class patterns
{
    public static  void solidrhombus( int n)
    {int counter = 5;
        for(int i=0;i<n;i++)
        {
           for (int j=n-i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
        }
    }

    public static void NumPyramid(int n)
    {
        for (int i=1;i<n+1;i++){
            for(int j=n-i;j>0;j--)
                System.out.print(" ");
            
            for(int j=0;j<i;j++)
                System.out.print(i+" ");
           
            for(int j=n-i;j>0;j--)
                System.out.print(" ");
        System.out.println();
        }
    }

    public static void PlinedronicNumpyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void butterfly(int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            for(int j=2*(n-i-1) ; j>0 ; j--)
            {
                System.out.print(" ");
                
            }
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0 ; i<n ; i++)
        {
            for(int j=4 ; j>i ; j--)
            {
                System.out.print("*");
            }
            for(int j=0 ;j<2*i ; j++)
            {
                System.out.print(" ");
            }
            for(int j=4;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void diamond(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
            for(int i=n;i>=0;i--)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
}

public static void main(String args[])
    {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a value");
        n=sc.nextInt();
        solidrhombus(n);
        NumPyramid(n);
        PlinedronicNumpyramid(n);
        butterfly(n);
        diamond(n);
    }
}