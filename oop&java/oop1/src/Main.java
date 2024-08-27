//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //khoulyoClass obj= new khoulyoClass();
        khoulyoClass obj= new khoulyoClass(2 , 4,3);//overloading constructor
        // obj.SetWidth(12.2);
//        System.out.println("Enter your length");
//        Scanner input = new Scanner(System.in);
//        obj.setLength(input.nextInt());


        // default value in constructor
        System.out.println("length is : "+ obj.getLength());
        System.out.println("width is : "+ obj.getWidth());


        System.out.println("area is : "+obj.getArea());


    }
}