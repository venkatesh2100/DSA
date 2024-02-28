package Leetcode;

public class Easy_1071 {
    public String gcdOfStrings(String str1, String str2) {
        //if concanted Strings are not equal return null
        if(!((str1 + str2).equals(str2 + str1))){
            return "";
        }else{
            int n=gcd(str1.length(),str2.length());
            return str1.substring(0,n);


        }

    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}
