public class euclid {
    public static void main(String[] args){
        int[] input = {3, 9, 6, 36};
        while(!isAllEqual(input)){
            for(int i = 1; i < input.length; i++){
                if(input[i] > input[i-1] ){
                    input[i] = input[i]-input[i-1];
                }else if(input[i-1] > input[i]){
                    input[i-1] = input[i-1] - input[i];
                }
            }
        }
        System.out.println(input[0]);
    }

    static boolean isAllEqual(int[] input){
        int equal = input[0];
        for(int i = 1; i < input.length; i++){
            if(input[i] != equal){
                return false;
            }
        }
        return true;
    }
}
