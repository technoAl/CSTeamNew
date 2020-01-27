import java.io.*;
import java.util.*;

public class maximumSumCombination {
    public static void main(String[] args) {
        int[] in1 = {9, 3, 5, 7, 3};
        int[] in2 = {5, 8, 1, 4, 5};
        int totalTop = in1[0];
        int totalBottom = in2[0];
        for(int i = 1; i < in1.length; i++){
            int oldTop = totalTop;
            int oldBottom = totalBottom;
            totalTop = Math.max(oldBottom + in1[i], totalTop);
            totalBottom = Math.max(oldTop + in2[i], totalBottom);
            System.out.println(totalTop + " " + totalBottom);
        }
        System.out.println(Math.max(totalTop, totalBottom));
    }


}
