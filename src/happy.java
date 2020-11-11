import java.util.ArrayList;
import java.util.List;

public class happy {

	public static void main(String args[]) {

		for(int i = 0 ; i < 1000; i++){
			fill(i);
		}

		if(happy(19)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
		if(happy(13)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
		if(!happy(4)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
		if(happy(44)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
		if(!happy(17)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
		if(happy(97)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
		if(happy(331)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
		if(!happy(335)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
		if(happy(262)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
		if(!happy(321)) System.out.println("CORRECT");
		else System.out.println("INCORRECT");
	}

	static boolean[] isHappy = new boolean[100000];

	static boolean happy (int n){
		return isHappy[n];
	}

	static void fill(int start){
		List<Integer> storedNumbers = new ArrayList<>();
		int current = start;
		storedNumbers.add(start);
		for(int i = 0; i < 10000; i++){
			current = sum(current);
			storedNumbers.add(current);
			if(current == 1){
				for(int j: storedNumbers){
					isHappy[j] = true;
				}
			}
		}
	}

	static int sum(int n){
		int res = 0;
		while(n > 0){
			res += Math.pow((n % 10),2);
			n /= 10;
		}
		return res;
	}
}
