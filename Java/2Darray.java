import java.util.Scanner;

class 2Darray
{
    public static  void main(String args[])
    {   int x,y;
        int[][] numbers= new int[x][y];
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
            numbers[i][j]=sc.nextInt();
            }
        }
        for(int j=0;j<y;j++){
            System.out.print(numbers[0][j]);
        }
        for(int i=1;i<x;i++){
            System.out.print(numbers[i][5]);
        }
        for(int j=4;j>=0;j--){
            System.out.print(numbers[5][j]);
        }
    }
}