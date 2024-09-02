//https://judge.beecrowd.com/en/problems/view/1048
import java.util.*; // Imports all classes in the java.util package
import java.io.*;   // Imports all classes in the java.io package
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double num=input.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00"); // تحديد النمط لعرض أول رقمين فقط بعد الفاصلة

        String formattedNumber = df.format(num);


        if(num>0&&num<=400) {
             formattedNumber = df.format((num * .15 + num));
        System.out.println("Novo salario: " + formattedNumber);
             formattedNumber = df.format((num * .15 ));
        System.out.println("Reajuste ganho: "+formattedNumber);
        System.out.println("Em percentual: 15 %");
    } else if (num>400&&num<=800) {
            formattedNumber = df.format((num * .12 + num));
        System.out.println("Novo salario: " + formattedNumber);
            formattedNumber = df.format(num * .12 );
        System.out.println("Reajuste ganho: "+formattedNumber);
        System.out.println("Em percentual: 12 %");
    }else if (num>800&&num<=1200) {
            formattedNumber = df.format((num * .1 + num));
            System.out.println("Novo salario: " + formattedNumber);
            formattedNumber = df.format((num * .1 ));
        System.out.println("Reajuste ganho: "+formattedNumber);
        System.out.println("Em percentual: 10 %");
    }else if (num>1200&&num<=2000) {
            formattedNumber = df.format((num * .07 + num));
        System.out.println("Novo salario: " +formattedNumber );
            formattedNumber = df.format(.07*num);
        System.out.println("Reajuste ganho: "+formattedNumber);
        System.out.println("Em percentual: 7 %");
    }else {
            formattedNumber = df.format((num * .04 + num));
        System.out.println("Novo salario: " +formattedNumber );
            formattedNumber = df.format(.04*num);
        System.out.println("Reajuste ganho: "+formattedNumber);
        System.out.println("Em percentual: 4 %");
    }

    }
}
