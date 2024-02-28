package DSA.ARRAYS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_list {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(90);
        integerList.add(50);
        integerList.add(60);
        for(int num:integerList){
            System.out.print(num+" ");
        }
        integerList.set(1,100);
        integerList.remove(2);
        integerList.remove(Integer.valueOf(100));
        integerList.clear();
        System.out.println("After update");
        for(int num:integerList) {
            System.out.print(num + " ");
        }
        Arrays.asList();
    }
}
