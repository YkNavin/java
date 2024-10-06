import java.util.Scanner;

class maxMin
{
    public static void main(String args[])
    {
        int [] Nums=new int[5];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Scanner sc=new Scanner (System.in);
        for(int i=0 ; i<Nums.length;i++)
        {
            Nums[i]=sc.nextInt();
            
        }
        for(int i=0;i<Nums.length;i++)
        {
            System.out.print(Nums[i]);
        }
        for(int i=0;i<Nums.length;i++)
        {
            if(Nums[i]>max)
            {
                max=Nums[i];
            }
            if(Nums[i]<min)
            {
                min=Nums[i];
            }
        }
        System.out.println("\n The maximun in the arrays is :"+max+"\n also the minimum in the array is :"+min);
    }
}