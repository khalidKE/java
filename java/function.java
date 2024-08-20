import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

print();
System.out.println(sum(2.5,3));


    }
    // define function
    // public static datatype nameOfFunction
    public static void print(){
        System.out.println("hello coder");
    }

    public static int sum(int num1,int num2)
    {
        return num1+num2;
    }

    //overloading
    // different in datatype , ترتيب , عدد البراميتر
    public static double sum(double num1, int num2){
        return num1+num2;
    }

    public static double sum(int num1, double num2){
        return num1+num2;
    }

    public static double sum(int num1, int num2 ,int num3){
        return num1+num2+num3;
    }

    // not overloading

    /*
    1-
    public static void av(int num1,int num2){
        System.out.println("ok");
    }
    public static int av(int num1,int num2){
        System.out.println("ok");
    }
    */

    /*
    2-
    public static void av(int num1,int num2){
        System.out.println("ok");
    }
    public static void av(int nm1,int nm2){ // تغير في اسم البراميتر
        System.out.println("ok");
    }
     */


}
