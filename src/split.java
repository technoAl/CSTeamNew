import java.io.*;
import java.util.*;

public class split {
	public static void main(String[] args){
		int[] input = {};
		List<Integer> fives = new ArrayList<>();
		List<Integer> threes = new ArrayList<>();
		for(int i = 0; i < input.length; i++){
			if(input[i] % 5 == 0){
				fives.add(input[i]);
				input[i] = -1;
			}else if(input[i] % 3 == 0){
				threes.add(input[i]);
				input[i] = -1;
			}
		}

	}
}
