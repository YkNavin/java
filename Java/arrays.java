import java.util.*;
class arrays
{
    public static void main (String args[])
    {   System.out.println("Enter the numbers of names you want to input");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String [] Names=new String[n];
        for(int i=0;i<n;i++)
        {
            Names[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("The Names are :"+Names[i]);
        }
    }
}