import java.util.*;
import java.io.*;

public class olympics {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("olympics.in"));
        int n = in.nextInt();
        int[][] input = new int[n][6];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 6; j++){
                input[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < n;i++){
            boolean count = isCount(input[i]);
            boolean color = isColor(input[i]);
            if(color && count){
                System.out.println("both");
            }else{
                if(count){
                    System.out.println("count");
                }else if(color){
                    System.out.println("color");
                }else{
                    System.out.println("none");
                }
            }
        }


    }

    static boolean isCount(int[] in){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < 3; i++){
            sum1+=in[i];
            sum2+=in[i+3];
        }
        return sum1 > sum2;
    }

    static boolean isColor(int[] in){
       if(in[0] > in[3]){
           return true;
       }else if(in[0] == in[3]){
           if(in[1] > in[4]){
               return true;
           }else if(in[1] == in[4]){
               if(in[2] > in[5]){
                   return true;
               }
           }
       }
       return false;
    }
}
