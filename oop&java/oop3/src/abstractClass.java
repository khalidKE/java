//abstract class لايمكنك انشاء obj منه
// is super class عشان  تورث منها فقط او تعمل override
// public + absract + ..

public abstract class abstractClass {
    private String name;
    private int num;

    abstractClass()
    {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}