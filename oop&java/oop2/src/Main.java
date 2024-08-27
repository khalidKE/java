 // static methods

public class Main {
    public static void main(String[] args) {

            car obj=new car();
            car obj2=new car();

        System.out.println(obj2.getNumberOfObj());  // 2
        car obj3=new car();
        car obj4 =new car();
        System.out.println("number of use this class : "+obj2.getNumberOfObj()); //4

//----------------------------------------------
        // static class " can use this class without create obj"
        System.out.println("sum of 2 num : "+calc.add(2,4));
        System.out.println("sub of 2 num : "+calc.sub(10,3));
        System.out.println("multi of 2 num : "+calc.multi(2,3));
    }

}
