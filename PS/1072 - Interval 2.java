//https://judge.beecrowd.com/en/problems/view/1072
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);

        int t= cin.nextInt();
        int c=0,p=0;
        for (int i=0;i<t;i++)
        {
            int x=cin.nextInt();
            if (x>=10&&x<=20)
                c++;
            else
                p++;
        }
        System.out.println(c+" in");
        System.out.println(p+" out");

    }
}