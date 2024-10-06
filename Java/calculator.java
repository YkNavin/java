import java.util.*;

 class FunctionAdd{

        public int Add(int num1,int num2){
        int Sum =num1 + num2;
        return Sum;

        }
 }

    //main code

public class calculator{

public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        //function call
        FunctionAdd plz = new FunctionAdd();

         int result = plz.Add(a,b);
        System.out.println(result);

    }
}