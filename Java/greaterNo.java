import java.util.*;

public class greaterNo{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter the vslues off a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        if (a==b){
            System.out.println("The values of the number are equal");
        }
        else if(a<b){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("a is greater than b");
        }
    }
}