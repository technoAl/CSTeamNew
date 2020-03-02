import java.util.*;

public class setMinusSet {
	public static void main(String[] args){
		String s= "PERIWINKLES ARE PERFECT";
		String t = "TULIPS ARE TERRIFIC";
		s = s.toLowerCase();
		t = t.toLowerCase();

		boolean[] alph = new boolean[26];
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(!t.contains(Character.toString(s.charAt(i))) && s.charAt(i) - 97 > 0 && !alph[s.charAt(i) - 97]){
				count++;
				alph[s.charAt(i)-97] = true;
			}
		}
		System.out.println(count);
	}
}
