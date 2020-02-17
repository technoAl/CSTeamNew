import java.util.*;
import java.io.*;

public class football {
    public static void main(String[] args){
        int m = 55;
        int n = 100-m;
        int one = 10;
        int two = 7;
        int three = -4;
        String[] dp = new String[n];
        for(int i = 0; i < dp.length; i++){
            dp[i] = "";
        }
        dp[0] = "r";
        while(dp[n-1].length() == 0){
            dpPass(dp, one, two);
            if(dp[n-1].length() != 0){
                System.out.println(dp[n-1]);
                break;
            }else{
                reduc(dp, three);
            }
        }

    }

    static String[] dpPass(String[] dp, int one, int two){
        for(int i = 0; i < dp.length; i++){
            if(dp[i].length() != 0) {
                if (i + one < dp.length && (dp[i+one].length() == 0 || dp[i].length()+1 < dp[i+one].length())) {
                    dp[i + one] = dp[i] + "F";
                }
                if (i + two < dp.length && (dp[i+two].length() == 0 || dp[i].length()+1 < dp[i+two].length())) {
                    dp[i + two] = dp[i] + "R";
                }
            }
        }
        return dp;
    }
    static String[] reduc(String[] dp, int three){
        for(int i = 0; i < dp.length; i++){
            if(dp[i].length() !=0){
                if(i + three >= 0 && (dp[i+ three].length() == 0 || dp[i].length()+1 < dp[i + three].length())){
                    dp[i+ three] = dp[i] + "B";
                }
            }
        }
        return dp;
    }
}
