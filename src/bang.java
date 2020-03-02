import java.io.*;
import java.util.*;

public class bang {
	public static void main(String[] args){
		String input = "barbara and benny bit the bullet";
		for(int i = 1; i < input.length(); i++){
			if(input.charAt(i-1) == 'b'){
				String ins = input.substring(0, i+1);
				String outs = input.substring(i+1);
				if(input.charAt(i) == 'e' || input.charAt(i) == 'a' ||  input.charAt(i) == 'i' ||  input.charAt(i) == 'o' ||  input.charAt(i) == 'u'){
					input = ins + "ng" + outs;
				}
			}
		}
		System.out.println(input);
	}
}
