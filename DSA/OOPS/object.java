package DSA.OOPS;
public class object {
    int num;

    public object(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "object{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        object obj=new object(100);
        System.out.println(obj);
    }
}

