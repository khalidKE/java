// https://judge.beecrowd.com/en/problems/view/1044
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);


    int x=cin.nextInt();
    int y=cin.nextInt();
    if (y%x==0||x%y==0)
        System.out.println("Sao Multiplos");
    else
        System.out.println("Nao sao Multiplos");

    }
}