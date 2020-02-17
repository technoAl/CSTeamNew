import java.io.*;
import java.util.*;

public class distinctpowers {
    public static void main(String[] args){
        int n = 1101;
        int k = 7;
        int maxPower = maxPower(k, n) + 1;
        int start = n;
        System.out.println(convertToBinary(maxPower));
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < maxPower; i++){
            int sum = 0;
            int pow = 1;
            String s = convertToBinary(i);
            for(int j = s.length()-1; j >= 0; j--){
                sum += Character.getNumericValue(s.charAt(j)) * pow;
                pow*= k;
            }
            if(sum > n) {
                min = Math.min(min, sum);
                System.out.println(s);
            }


        }
        System.out.println(min);

    }

    static int maxPower(int pow, int input){
        int exp = pow;
        while(pow * exp <= input){
            pow*=exp;
        }
        return pow;
    }

    static String convertToBinary(int n){
        String fin = "";
        while(n > 0) {
            if (n % 2 == 0) {
                fin += "0";
            } else {
                fin += "1";
            }
            n /= 2;
        }
        char[] chars = fin.toCharArray();
        for(int i = 0; i < fin.length() / 2; i++){
            char a = fin.charAt(i);
            chars[i] = chars[fin.length() - i-1];
            chars[fin.length() - i-1] = a;
        }
        return String.valueOf(chars);
    }
}
