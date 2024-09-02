//https://judge.beecrowd.com/en/problems/view/1134
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
    int x=0,a=0,b=0,c=0;
       while (x!=4)
       {
           x= cin.nextInt();
           switch (x) {
               case 1:
                   a++;
                   break;
               case 2:
                   b++;
                   break;
               case 3:
                   c++;
                   break;

           }
       }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+b);
        System.out.println("Diesel: "+c);

    }
}