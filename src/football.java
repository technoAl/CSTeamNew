import java.util.*;
import java.io.*;

public class football {
    public static void main(String[] args){
        int m = 55;
        int n = 100-m;
        String[] dp = new String[n];
        for(int i = 0; i < dp.length; i++){
            dp[i] = "";
        }
        dp[0] = "r";
        while(dp[n-1].length() == 0){
            dpPass(dp);
            if(dp[n-1].length() != 0){
                System.out.println(dp[n-1]);
                break;
            }else{
                reduc(dp);
            }
        }

    }

    static String[] dpPass(String[] dp){
        for(int i = 0; i < dp.length; i++){
            if(dp[i].length() != 0) {
                if (i + 10 < dp.length && (dp[i+10].length() == 0 || dp[i].length()+1 < dp[i+10].length())) {
                    dp[i + 10] = dp[i] + "F";
                }
                if (i + 7 < dp.length && (dp[i+7].length() == 0 || dp[i].length()+1 < dp[i+7].length())) {
                    dp[i + 7] = dp[i] + "R";
                }
            }
        }
        return dp;
    }
    static String[] reduc(String[] dp){
        for(int i = 0; i < dp.length; i++){
            if(dp[i].length() !=0){
                if(i - 4 >= 0 && (dp[i-4].length() == 0 || dp[i].length()+1 < dp[i-4].length())){
                    dp[i-4] = dp[i] + "B";
                }
            }
        }
        return dp;
    }
}
