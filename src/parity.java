import java.util.*;

public class parity {
    public static void main(String[] args){
        String input = "abccabdd";
        int[] freq = new int[26];
        for(int i = 0; i < input.length(); i++){
            freq[input.charAt(i)-97]++;
        }
        boolean isEven = true;
        boolean isOdd = true;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0 && freq[i]%2 == 0){
                isOdd = false;
            }
            if(freq[i] != 0 && freq[i] %2 == 1 ){
                isEven = false;
            }
        }
        if(!isOdd && !isEven){
            System.out.println("2");
        }else if(isOdd && !isEven){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
