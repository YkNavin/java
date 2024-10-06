import java.util.*;
public class loops
{
    public static void main(String args[])
    {
        int n=1;
        do
        {
            System.out.println("hi"+n);
            ++n;
        }
        while(n<5);
        {
            System.out.println("hi"+n);
            ++n;
        }
        for(int i=0;i<=5;i++)
        {
            System.out.println("hello"+i);
            for(int j=0;j<5;j++)
            {
                System.out.println("    world"+j);
            }
        }
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        System.out.println(a);
    }
}