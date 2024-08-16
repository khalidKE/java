import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // calc Area of rectangle
        // int length ,width ,area;
        // Scanner cin =new Scanner(System.in);
        // System.out.print("Enter the length : ");
        // length =cin.nextInt();
        // System.out.print("Enter the width : ");
        // width=cin.nextInt();
        // area=length*width;
        // System.out.println("the area of circle is : "+area);
        
        // clac area of circle 
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the radius ,plz");
        int r;
        r=input.nextInt();
        System.out.print("the area of circle is : "+r*r*3.14); 
    }
}
