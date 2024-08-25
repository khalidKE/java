// click right on main new class
public class khoulyoClass {
    private double length;
    private double width;

    // constructor same name of class
    khoulyoClass (){
        System.out.println("hello in constructor ");
        setLength(10.5);
        SetWidth(11.2);
    }

    // constructor overloading
    khoulyoClass(double l,double w){
        length=l;
        width=w;
    }

    //استدعاء كونستركتر داخل كونستركتر
    khoulyoClass(double l,double w , double x){
    //        length=l;
    //        width=w;
        this(l,w);// هنا بقوله استخدم الكونستركتر اللي فات 2
        System.out.println("size is : "+length*width*x);
    }

    //setter - Mutator
    public void setLength (double l){
        length=l;
    }
    public void SetWidth (double w){
        width=w;
    }

    //getter - Accessor
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public double getArea() {
        return width*length;
    }
}
