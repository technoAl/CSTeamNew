import java.io.*;
import java.util.*;

public class dumplings {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("dumplings.in"));
		int n = in.nextInt();
		int x = in.nextInt();
		HashMap<Integer, TreeSet<Integer>> plates = new HashMap<>();
		int[] origin = new int[n+1];
		for(int i = 1; i < n+1; i++){
			int tmp = in.nextInt();
			origin[i] = tmp;
			if(plates.containsKey(tmp)){
				TreeSet<Integer> tmpSet = plates.get(tmp);
				tmpSet.add(i);
				plates.remove(tmp);
				plates.put(tmp, tmpSet);
			}else{
				TreeSet<Integer> tmpSet = new TreeSet<>();
				tmpSet.add(i);
				plates.put(tmp, tmpSet);
			}
		}
		in.close();

		int result = Integer.MAX_VALUE;
		int resA = Integer.MAX_VALUE;
		int resB = Integer.MAX_VALUE;
		for(int i = 1; i < n+1 && i < resB; i++){
			int compliment = x - origin[i];
			if(!plates.containsKey(compliment)){
				continue;
			}else{
				TreeSet<Integer> tmpSet = plates.get(compliment);
				if(tmpSet.isEmpty()){
					plates.remove(compliment);
					continue;
				}
				while(tmpSet.first() <= i){
					tmpSet.remove(tmpSet.first());
					if(tmpSet.isEmpty()){
						break;
					}
				}

				if(!tmpSet.isEmpty() && result > i + tmpSet.first()){
					resA = i;
					resB = tmpSet.first();
					result = i + tmpSet.first();
				}
			}
		}


		PrintWriter out = new PrintWriter(new File("dumplings.out"));
		out.println(resA + " " + resB);
		out.close();
	}
}
