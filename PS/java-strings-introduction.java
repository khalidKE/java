// https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String sum = A + B;
        System.out.println(sum.length());

        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.print(Character.toUpperCase(A.charAt(0)));
        for (int i = 1; i < A.length(); i++) {
            System.out.print(A.charAt(i));
        }
        System.out.print(" ");

        System.out.print(Character.toUpperCase(B.charAt(0)));
        for (int i = 1; i < B.length(); i++) {
            System.out.print(B.charAt(i));
        }
    }
}
