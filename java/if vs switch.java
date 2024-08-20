import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("check your grade in num or ch ?!");
        String x=input.next();
        if(x.equals("num"))
        {
        /*
        85% to 100% – Excellent
        75% to 85% – Very Good
        65% to 75% – Good
        50% to 65% – Pass
        Below 50% – Fail
        */
            System.out.print("Enter your grade in number: ");
            float grade = input.nextFloat();
        if(grade>85)//nested if
            System.out.println("Excellent");
        // if (grade>75&&grade<=85)
        else if (grade>75)
            {
            System.out.println("Very Good");
        } else if (grade > 65 ) {
            System.out.println("Good");
        } else if (grade>50) {
            System.out.println("Pass");
        }
        else
            System.out.println("Fail");}
else {
            // switch
            char ch;
            System.out.print("Enter your char ");
            ch = input.next().charAt(0);

            switch (ch)// only take integer number & char
            {
                case 'A':
                    System.out.println("Excellent");
                    break;// to end switch
                case 'B':
                    System.out.println("Very Good");
                    break;
                case 'C':
                    System.out.println("Good");
                    break;
                default:
                    System.out.println("Fail");
            }

        }
    }
}
