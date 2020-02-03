import java.io.*;
import java.util.*;

public class contours {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("contours.in"));
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] input = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                input[i][j] = in.nextInt();
            }
        }
        int[] res = new int[2];
        for(int i = 1; i < n-1; i++){
            for(int j = 1; j < m-1; j++){
                if(input[i][j] > input[i-1][j] && input[i][j] > input[i][j-1] && input[i][j] > input[i][j+1] && input[i][j] > input[i+1][j]){
                    if(input[res[0]][res[1]] < input[i][j]){
                        res[0] = i +1;
                        res[1] = j +1;
                    }
                }
            }
        }

        if(res[0] == 0 || res[1] == 0){
            System.out.println("()");
        }else {
            System.out.println("(" + res[0] + "," + res[1] + ")");
        }

    }
}
