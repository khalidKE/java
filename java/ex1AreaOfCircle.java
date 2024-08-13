import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int length ,width ,area;
        Scanner cin =new Scanner(System.in);
        System.out.print("Enter the length : ");
        length =cin.nextInt();
        System.out.print("Enter the width : ");
        width=cin.nextInt();
        area=length*width;
        System.out.println("the area of circle is : "+area);
    }
}