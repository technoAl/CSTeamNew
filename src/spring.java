import java.io.*;
import java.util.*;

public class spring {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("Inputs/test3.in"));
		int n = in.nextInt();
		int[] originalSet = new int[n];
		for(int i = 0; i < n; i++){
			originalSet[i] = in.nextInt();
		}
		in.close();
		long[] dp = new long[n];
		dp[0] = originalSet[0];
		long res = 0;
		for(int i = 1; i < n; i++){
			long max = 0;
			for(int j = 0; j < i; j++){
				if(originalSet[j] <= originalSet[i]){
					dp[i] = Math.max(dp[i], dp[j]);
				}
			}
			dp[i] += originalSet[i];
		}
		for(int i = 0; i < n; i++){
			res = Math.max(dp[i], res);
		}
		System.out.println(res);
	}
}
