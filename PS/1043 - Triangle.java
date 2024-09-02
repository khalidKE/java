//https://judge.beecrowd.com/en/problems/view/1043
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);

        double a,b,c;
        a= cin.nextDouble();b= cin.nextDouble();c= cin.nextDouble();
        if (a<b+c&&b<a+c&&c<a+b) // شرط ان يكون مثلث لازم مجموع أي ضلعين فيهم يكون أكبر من الضلع التالت.
            System.out.println("Perimetro = "+(a+b+c));
        else
            System.out.println("Area = "+0.5*(a+b)*c);
    }
}