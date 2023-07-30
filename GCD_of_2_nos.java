import java.util.*;
public class GCD_of_2_nos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//defining an object for scanner class
        System.out.println("Enter any two numbers to find their GCD:");
        int num1=sc.nextInt();//first number entered by the user
        int num2=sc.nextInt();//second number entered by the user
        int gcd=GCD_using_Euclid(num1,num2);
        System.out.println("This is the GCD of the numbers entered:"+Integer.toString(gcd));
    }
    public static int GCD_using_Euclid(int n1,int n2)//function to find the gcd of two numbers using Euclid's algorithm
    {
        int r;
        while (n2!=0)
        {
            r=n1%n2;
            n1=n2;
            n2=r;
        }
        return n1;
    }
}
