import java.util.*;
import java.io.*;

public class enclosure {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("enclosure.in"));
        String[] inputs = new String[5];
        for(int i = 0; i < 5;i++){
            inputs[i] = in.nextLine();
        }
        in.close();

        for(int i = 0; i < 5; i++){
            int type = getType(inputs[i]);
            List<Integer> answers = solve(inputs[i], type);
            for(int j = 0; j < answers.size(); j++){
                System.out.print(answers.get(j) + " ");
            }
            System.out.println();
        }

    }

    static ArrayList<Integer> solve(String input, int type){
        ArrayList<Integer> result = new ArrayList<>();
        if(type == 1 || type == 3 || type == 5){
            boolean primer = false;
            boolean primer2 = false;
            boolean primer4 = false;
            int count = 0;
            for(int i = 0; i < input.length(); i++){
//                count++;
//                if(Character.isDigit(input.charAt(i))&& i-1 >=0 && Character.isDigit(input.charAt(i-1))){
//                    count--;
//                }
                if(getType2(input.charAt(i)) == type-1){
                    primer = true;
                    continue;
                }
                int tmpType  = getType2(input.charAt(i));
                if(primer &&  (tmpType%2==0)&&tmpType != -1){
                    if(primer2) {
                        primer4 = true;
                    }else{
                        primer2 = true;
                    }
                }
                boolean prev = false;
                if(primer4 && tmpType%2==1 && tmpType != -1){
                    primer4 = false;
                    prev = true;
                }
                if(primer2 && !prev && tmpType%2==1 && tmpType != -1){
                    primer2 = false;
                }
                boolean grr = false;
                if(tmpType == -1 && !isOperator(input.charAt(i)) && i + 1 < input.length() && Character.isDigit(input.charAt(i+1))){
                    grr = true;
                }
                if(!primer4 && !primer2 && primer && (tmpType%2==1||grr ||!isOperator(input.charAt(i)))){
                    if(input.charAt(i) != '}') {
                        result.add(i + 2);
                    }
                }
            }
        } else if(type == 0 || type == 2 || type == 4) {
            boolean primer = false;
            boolean primer2 = false;
            boolean primer4 = false;
            for(int i = input.length()-1; i >= 0; i--){

                if(input.charAt(i) == type-1){
                    primer = true;
                    continue;
                }
                int tmpType  = getType2(input.charAt(i));
                if(primer &&  (tmpType%2==1)&&tmpType != -1){
                    if(primer2) {
                        primer4 = true;
                    }else{
                        primer2 = true;
                    }
                }
                if(primer4 && tmpType%2==0 && tmpType != -1){
                    primer4 = false;
                }else if(primer2 && tmpType%2==0 && tmpType != -1){
                    primer2 = false;
                }
                boolean grr = false;
                if(tmpType == -1 && i - 1 >=0 && Character.isDigit(input.charAt(i-1))){
                    grr = true;
                }
                if(!primer4 && !primer2 && primer && (tmpType%2==0||grr || !isOperator(input.charAt(i)))){
                    result.add(i-1);
                }
            }
        }
        return result;
    }
    static boolean isOperator(char c){
        if(c == '*'){
            return true;
        }else if(c == '/'){
            return true;
        }else if(c == '+'){
            return true;
        }else if(c == '-'){
            return true;
        }
        return false;
    }
    static int getType2(char c){
        if(c=='('){
            return 0;
        }else if(c==')'){
            return 1;
        }else if(c=='['){
            return 2;
        }else if(c==']'){
            return 3;
        }else if(c=='{'){
            return 4;
        }else if(c=='}'){
            return 5;
        }
        return -1;
    }
    static int getType(String input){// 1 is (, 2 is ), 3 is [
        int[] types = new int[6];
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i)=='('){
                types[0]++;
            }else if(input.charAt(i)==')'){
                types[1]++;
            }else if(input.charAt(i)=='['){
                types[2]++;
            }else if(input.charAt(i)==']'){
                types[3]++;
            }else if(input.charAt(i)=='{'){
                types[4]++;
            }else if(input.charAt(i)=='}'){
                types[5]++;
            }
        }

        if(types[0] < types[1]){
            return 0;
        } else if(types[0] > types[1]){
            return 1;
        } else if(types[2] < types[3]){
            return 2;
        } else if(types[2] > types[3]){
            return 3;
        } else if(types[4] < types[5]){
            return 4;
        } else if(types[4] > types[5]){
            return 5;
        }
        return -1;
    }
}
