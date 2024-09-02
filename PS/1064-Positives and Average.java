//https://judge.beecrowd.com/en/problems/view/1064
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);

        double a,sum=0.00;
        int c=0;
     for(int i=0;i<6;i++)
        {
            a=cin.nextDouble();
            if(a>0)
            {
                c++;
                sum+=a;
            }
        }
        System.out.println(c+" valores positivos");
        System.out.printf("%.1f\n",sum/c);

    }
}