import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

        // array
        // datatype[] arrayName = new datatype [size]



        //int[] arr = new int [5];
//        for (int i=0;i<5;i++) // to input
//            arr[i]=input.nextInt();

//        for (int i=0;i<5;i++) // to print
//            System.out.println(arr[i]);

//        System.out.println(arr[0]);
//        System.out.println(arr);

// final like const
        final int MAX_SIZE =5;
        int[] arr = new int [MAX_SIZE];

        /* عايز تجيب Size بتاع array
            arr.length
        */

        // Array initialization
        int[] ar = {10, 20, 30};
        System.out.println(ar[0]);   // Prints: 10
        System.out.println(Arrays.toString(ar)); // Prints: [10, 20, 30]


// to create 2 dimensional array 
        int [][] array = new int [2][5];// 2 ==> rows , 5==> cols



    }

}
