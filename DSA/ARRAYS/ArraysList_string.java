package DSA.ARRAYS;
import java.util.ArrayList;
import java.util.List;

public class ArraysList_string {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("NAMI");
        stringList.add("Robin");
        stringList.add("Usopp");
        System.out.println(stringList.add("sanji"));
        System.out.println(stringList.toString());
        System.out.println(stringList.hashCode());
        for(String piece:stringList){
            System.out.print(piece+" ");
        }
        System.out.println(stringList.size());

    }
}
