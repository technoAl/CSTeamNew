import java.util.*;

public class sortByFrequency {
    public static void main(String[] args){
        String input = "programming";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] in = input.toCharArray();
        for(int i = 0; i < in.length; i++){
            if(map.containsKey(in[i])){
                int j = map.remove(in[i]);
                j++;
                map.put(in[i], j);
            }else{
                map.put(in[i], 1);
            }
        }
        while(!map.isEmpty()) {
            char max = ' ';
            for (Character c : map.keySet()) {
                if(!map.containsKey(max)){
                    max = c;
                }
                if(map.get(c) > map.get(max)){
                    max = c;
                }
                if(map.get(c) == map.get(max) && c != max){
                    max = (char)Math.min((int)max,(int) c);
                }
            }
            for(int i = 0; i < map.get(max);i++) {
                System.out.print(max);
            }
            map.remove(max);
        }
    }
}
