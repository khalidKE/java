//https://judge.beecrowd.com/en/problems/view/1114
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);

       while (true)
       {
           int x= cin.nextInt();
           if (x==2002)
           {
               System.out.println("Acesso Permitido");
               return;
           }
           else
               System.out.println("Senha Invalida");
       }

    }
}