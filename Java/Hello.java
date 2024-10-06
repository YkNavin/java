import java.util.Scanner;

class Hello
{
    public static void main(String args[])
    {
        System.out.println("hello world");
        int n;
        int b;
        int a;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        a =sc.nextInt();
        //b=sc.nextINt("Enter the value of b");
        --n;
        b=a+n;
        System.out.println("The number  x is :"+n);
        System.out.println("sum ="+b);
    }
}