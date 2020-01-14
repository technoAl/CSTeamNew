import java.util.*;

public class collatz {
    public static void main(String[] args) {
        long max = Integer.MIN_VALUE;
        long start = System.currentTimeMillis();
        for(int i = 1; i < 1000000; i++){
            System.out.println(i);
            System.out.println(i);
            int[] dp = new int[10000000];
            Arrays.fill(dp,Integer.MAX_VALUE);
            int n = i;
            ArrayList<Integer> seq = new ArrayList<>();
            int length = 0;
            while(n != 1){
                seq.add(n);
                if(dp[n] != Integer.MAX_VALUE){
                    length = seq.size() + dp[n];
                    break;
                }
                length = seq.size();
                if(n % 2 == 0){
                    n/=2;
                }else{
                    n *=3;
                    n++;
                }
            }
            int count = 0;
            for(int j = seq.size()-1; j >= 0; j--){
                dp[seq.get(j)] = count;
                count++;
            }
            max = Math.max(max, length);
            //max = Math.max(max, collatz(i));
        }
        System.out.println(max);
        long end = System.currentTimeMillis();
        System.out.println(end-start + " time");
    }
    static int collatz(long n){
        if(n ==1){
            return 1;
        }else if(n%2 == 0) {
            return 1 + collatz(n/2);
        }else{
            return 1 + collatz(3*n + 1);
        }
    }
}
