import java.io.*;
import java.util.*;

public class speedUp {
	public static void main(String[] args){
		String input = "ilovelettuce";
		char[] alph = new char[26];
		for(int i = 0; i < 26; i++){
			alph[i] = (char) (97 + i);
		}
		String result = "";
		for(int i = 0; i < input.length(); i++){
			char newChar = alph[((input.charAt(i) - 97) + i + 1)%26];
			result += newChar;
		}
		System.out.println(result);
	}
}
