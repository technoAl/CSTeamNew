public class Shuffle {
	public static void main(String[] args){
		System.out.println(shuffled("aiohn", new int[]{3, 1, 4, 2, 0}));
	}

	static String shuffled(String input, int[] indices){
		char[] res = new char[indices.length];
		for(int i = 0; i < indices.length; i++){
			res[indices[i]] = input.charAt(i);
		}
		String resStr = "";
		for(int i = 0; i < indices.length; i++){
			resStr += Character.toString(res[i]);
		}

		return resStr;
	}
}


