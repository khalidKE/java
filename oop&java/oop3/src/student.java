// inheritance
// constructors not inherited

public class student extends person {
    private long  no_of_phone;
    private double GPA;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setNo_of_phone(int no_of_phone) {
        this.no_of_phone = no_of_phone;
    }
    public long  getNo_of_phone(){
        return no_of_phone;
    }
    student(){
    // try Access ==> Done
        name="pprotected";
    }
    student(long no_of_phone,String n,int a,String add){
        super(n,a,add); // استدعاء كونستراكتر بتاع الكلاس اللي بورث منه
                        // Reusability ==> Polymorphism
                        // super لازم يكتب في الاول
        this.no_of_phone = no_of_phone;

    }
    // overriding&inheritance ==> نفس كل حاجة فبتلغي الفانكشن القديمة اللي وارثها وتشتغل على الحاجة الجديدة
@Override
    public int getAge(){
    return 22;
}

////public String getAddress(){//can not override لانك كتبت في كلاس الاب  final
//    return "saaaa";
//}
    public void print(){
        super.printall();//استدعاء فانكشن
        System.out.println("number is : "+getNo_of_phone());
    }
}

