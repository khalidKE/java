public class person {
   protected String name; // by default public
    private int age;
    private String address;

    person(){
        System.out.println("hello");
    }
    person(String n,int a,String add){
        name=n;
        age=a;
        address=add;
    }

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public final String getAddress(){//can not override
        return address;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void printall(){
        // try Access ==> Done
        name="protected";
        System.out.println("name is : "+getName());
        System.out.println("age is : "+getAge());
        System.out.println("address is : "+getAddress());

    }
}

// protected تقدر تستخدم داخل الكلاس او الكلاس الابن الوارث منه

