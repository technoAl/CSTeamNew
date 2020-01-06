public class partition {
    public static void main(String[] args){
        int[] input = {1, 7, 15, 29, 11, 9};
        int sum = 0;
        for(int i = 0; i < input.length; i++){
            sum+=input[i];
        }
        int part = sum/input.length;
        for(int i = 1; i <= (input.length)/2; i++){
            int goal = i * part;

        }
    }

}
