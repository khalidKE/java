import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
person obj =new person();
    obj.setAddress("sadat");
    obj.setAge(20);
    obj.setName("khalid");

    System.out.println("address is : "+obj.getAddress());
    System.out.println("age is : "+obj.getAge());
    System.out.println("name is : "+obj.getName());
    System.out.println("-----------------------------------------------");

    student objInheritance =new student();
    objInheritance.setAddress("sadat city");
    System.out.println(objInheritance.getAddress());
        System.out.println("-----------------------------------------------");

        objInheritance.setNo_of_phone(456789);
       System.out.println(objInheritance.getNo_of_phone());
        System.out.println("-----------------------------------------------");

        student k=new student(12,"ahmed",21,"Alex");
        System.out.println(k.getName()+" "+k.getAddress()+" "+k.getAge());
        System.out.println("-----------------------------------------------");

        student kk=new student();
        kk.print();
        System.out.println("-----------------------------------------------");



//abstractClass ob1=new abstractClass() ; // Errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr




               // long largeNumber = 9223372036854775807L;  // Maximum value for a long
              //  System.out.println("Large Number: " + largeNumber);

// ArrayList vs Array
        // ArrayList is Dynamic Size
        // Array is Fixed Size
            // to use ArrayList must include this library ==> import java.util.ArrayList;

        ArrayList<String> nameOfArrayList =new ArrayList<>();
        nameOfArrayList.add("khalid");
        nameOfArrayList.add("Ehab");
        nameOfArrayList.add("Ahmed");

        System.out.println(nameOfArrayList.size());// 3
        System.out.println(nameOfArrayList);// [khalid, Ehab, Ahmed]
        System.out.println(nameOfArrayList.get(1));// Ehab

        nameOfArrayList.remove(1);
        System.out.println(nameOfArrayList.get(1));// Ahmed
        System.out.println(nameOfArrayList);// [khalid, Ahmed]

        // replace
        nameOfArrayList.set(0,"zzzzz");
        System.out.println(nameOfArrayList);// [zzzzz, Ahmed]
    }
}