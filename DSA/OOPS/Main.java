package DSA.OOPS;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //by using classes we can create datatypes


        StudentRep venky=new StudentRep(21,"Venkatesh",99);
        StudentRep Kona=new StudentRep(32 ,"kona sai kumar",100);
        System.out.println(Kona.name);

        System.out.println(venky.name);
        System.out.println(venky.marks);
        System.out.println(venky.rollno);
        Kona.greet();
//        System.out.println(Arrays.toString(venky.name));
//        System.out.println(Arrays.toString(venky.rollno));
//        System.out.println(Arrays.toString(venky.marks));
    }
    public static class StudentRep{
         int rollno;
        String name;
        float marks;
         void greet(){
             System.out.println("Hi this is Venky "+this.name);

         }

        public StudentRep(int rollno ,String name ,float marks) {
            this.rollno = rollno;
            this.marks=marks;
            this.name=name;
        }
    }

}