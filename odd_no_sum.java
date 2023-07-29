import java.util.*;
public class odd_no_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till where you want to find the sum");
        int n=sc.nextInt();
        odd_no_sum obj1=new odd_no_sum();
        int sum=obj1.odd_sum(n);
        System.out.println("The sum of odd numbers is ");
        System.out.print(sum);
    }
    public int odd_sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}
