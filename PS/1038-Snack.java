// https://judge.beecrowd.com/en/problems/view/1038
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00"); // تحديد النمط لعرض أول رقمين فقط بعد الفاصلة


    int x=cin.nextInt();
    double y=cin.nextInt();
    switch (x){
        case 1:
            String formattedNumber = df.format(4.0*y);
            System.out.println("Total: R$ "+formattedNumber);
            break;
        case 2:
             formattedNumber = df.format(4.5*y);
            System.out.println("Total: R$ "+formattedNumber);
            break;
        case 3:
             formattedNumber = df.format(5.0*y);
            System.out.println("Total: R$ "+formattedNumber);
            break;
        case 4:
             formattedNumber = df.format(2.0*y);
            System.out.println("Total: R$ "+formattedNumber);
            break;
        case 5:
             formattedNumber = df.format(1.5*y);
            System.out.println("Total: R$ "+formattedNumber);
            break;
    }

    }
}