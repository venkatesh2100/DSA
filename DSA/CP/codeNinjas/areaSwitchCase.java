package CodeNinjas;

public class areaSwitchCase {
    public static void main(String[] args) {
        public static double areaSwitchCase(int ch, double []a) {
            // Write your code here
            double area=0.0;
            switch (ch){
                case 1:
                    area=Math.PI*a[0]*a[0];
                case 2:
                    area=a[0]*a[1];
            }
            return area;
        }
    }
}
