public class subarray {
    public static void main(String[] args){
        int[] input = {3, 7, 14};
        int[] dp = new int[input.length+1];
        int sum = input[0];
        dp[0] = 0;
        for(int i = 1; i < input.length; i++){
            sum+=input[i];
            dp[i] = dp[i-1]+input[i-1];
        }
        dp[input.length] = dp[input.length-1]+input[input.length-1];
        for(int i = 0; i < input.length; i++){
            for(int j = i; j < input.length;j++){
                int diff = dp[j+1]-dp[i];
                if(diff %input.length  == 0){
                    System.out.println(i + " " + j);
                }

            }
        }
    }
}
