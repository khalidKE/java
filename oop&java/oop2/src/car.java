public class car //static
 {
     private String nameOfCar;
     private int model;
     private static int numberOfObj;
     car(){
         nameOfCar="toyota";
         model=2018;
         numberOfObj++;
     }
     public int getNumberOfObj(){
         return numberOfObj;
     }
}
