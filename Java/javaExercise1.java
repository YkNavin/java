import java.util.*;
class javaExercise1
{
    public static float avgOfNums(float a,float b,float c)
    {
        float avg;
        avg=(a+b+c)/3;
        return avg;
    }

// Q2 Write a function to print the sum of all odd numbers from 1 to n.

    public static float sumOfOddNums(float n)
    {float sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2 != 0){
                sum = sum+i;
            }
        }
        return sum;
    }

   // Q3 Write a function which takes in 2 numbers and returns the greater of those two.

   public static void greatestOfTwo(float a,float b)
   {
    if(a>b)
    {
        System.out.println("The no "+a+" is the greatest ");
    }
    else if(a<b)
    {
        System.out.println("The no "+b+" is the greatest ");
    }
    else
        System.out.println("The both the numbers are equal");
   }

  //Q4 Write a function that takes in the radius as input and returns the circumference of a circle

  public static float circumference(float r)
  {
    float X;
    X=(2*r)*(3.14f);
    return X;
  }

 //Q5 Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.
public static void voteAge(int age)
{
    if(age>18)
    {
        System.out.println("The person is eligible to Vote");
    }
    else{
        System.out.println("The person is NOT eligible to Vote");
    }
}

//Q7 Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

public static void intergerCount(int n)
{int pos=-0,neg=0,zero=0,x;
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if(x>0)
            pos++;
        else if(x<0)
            neg++;
        else   
            zero++;

    }
System.out.println("The number of the postives are : "+pos);
System.out.println("The number of the negatives are :" +neg);
System.out.println("The number of the zeroes are : "+zero);
}

 //Q8 Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

public static int x_Raise_n(int x,int n)
{int power=1;
for(int i=0;i<n;i++)
{
    power=power*x;
}
return power;
}

    public static void main(String args[])
    {
        float n1,n2,n3;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of all three numbers:");
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        n3=sc.nextFloat();
        System.out.println("The avg of the 3 numbers are:"+avgOfNums(n1,n2,n3));;
        greatestOfTwo(n1,n2);
        System.out.println("The circumference of the circle of radius n3 is : "+circumference(n3));
        System.out.println("Sum of all odd numbers from 1 to n is : "+sumOfOddNums(n3));
        System.out.println("Enter the Age :");
        age=sc.nextInt();
        voteAge(age);
        intergerCount(5);
        System.out.println("The value of a raises to b is : "+x_Raise_n(age,5));
    }
}