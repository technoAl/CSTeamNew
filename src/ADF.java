import java.util.*;
import java.io.*;

public class ADF {
    private static final String NAME = "Alex Sun";
    private static final String PROBLEM_NAME = "ADF";
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File(PROBLEM_NAME + ".in"));
        PrintWriter out = new PrintWriter(new File(PROBLEM_NAME + ".out"));
        for(int i = 0; i < 5; i++){
            try{
                String a = in.nextLine();
                String b = in.nextLine();
                a = a.toUpperCase();
                b = b.toUpperCase();
                for(int j = 0; j < a.length(); j++){
                    if(a.charAt(j) > 90 || a.charAt(j) < 65){
                        a = a.replace(a.charAt(j), ' ');
                    }
                }
                a = a.replaceAll("\\s", "");
                b = b.replaceAll("\\s", "");
                for(int j = 0; j < b.length(); j++){
                    if(b.charAt(j) > 90 || b.charAt(j) < 65){
                        b = b.replace(b.charAt(j), ' ');
                    }
                }
                out.println(funcRun(a.toUpperCase(), b.toUpperCase()));
                System.out.println(funcRun(a,b));
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        in.close();
        out.close();
    }

    static int funcRun(String one, String two){
        if(one.length() == 0 || two.length() == 0){
            return 0;
        }
        int l1 = one.length();
        int l2 = two.length();
        int[][] dp = new int[l1][l2];

        int max = 0;
        ArrayList<Integer> sols = new ArrayList<>();
        for(int i = 0; i < l1; i++){
            for(int j = 0; j < l2; j++){
                if(one.charAt(i) == two.charAt(j)){
                    if(i == 0 || j== 0){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = dp[i-1][j-1] +1;
                    }
                    if(dp[i][j] > max){
                        max = dp[i][j];
                        sols.clear();
                        sols.add(i);
                    }else if(dp[i][j] == max){
                        sols.add(i);
                    }
                }
            }
        }
        //System.out.println(max);
        if(max == 0){
            return 0;
        }
        ArrayList<String> substrings = new ArrayList<>();
        String useful;
        if(sols.size() > 1){
            for(int i = 0; i < sols.size(); i++){
                substrings.add(one.substring(sols.get(i)-max+1, sols.get(i)+1));
            }
            Collections.sort(substrings);
            useful = substrings.get(0);
        }else {
            useful = one.substring(sols.get(0)-max+1, sols.get(0)+1 );
        }
        String[] split1 = one.split(useful);
        String[] split2 = two.split(useful);
        String three;
        String four = "";
        String five;
        String six = "";
        if(split1.length > 2){
            three = split1[0];
            for(int i = 1; i < split1.length; i++){
                four += split1[i];
            }
        }else if(split1.length == 2){
            three = split1[0];
            four = split1[1];
        }else{
            if(split1[0].charAt(0) == one.charAt(0)){
                three = split1[0];
                four = "";
            }else {
                four = split1[0];
                three = "";
            }
        }

        if(split2.length > 2){
            five = split2[0];
            for(int i = 1; i < split2.length; i++){
                six += split2[i];
            }
        }else if(split2.length == 2){
            five = split2[0];
            six = split2[1];
        }else{
            if(split2[0].charAt(0) == two.charAt(0)){
                five = split2[0];
                six = "";
            }else {
                five = split2[0];
                six = "";
            }
        }
        //System.out.println(three + " " + five +  " " + four + " " + six);
        return max + funcRun(three, five) + funcRun(four, six);
    }
}
