import java.util.*;
public class Avg_of_user_nums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 3 numbers");
        int a[]=new int[3];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Average of the three numbers entered by the user is:");
        int sum=0,avg=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        avg=sum/a.length;
        System.out.println(avg);
    }
}
