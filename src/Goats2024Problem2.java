import java.util.*;
import java.io.*;

public class Goats2024Problem2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("How many players?");
		int n = -1;
		while(n == -1){
			try{
				n = in.nextInt();
			}catch(Exception e){
				in = new Scanner(System.in);
				System.out.println("How many players?");
			}

		}
		Comparator<String> byName2 =(String a, String b)-> a.compareTo(b);
		TreeMap<String, Integer> sortByName = new TreeMap<String, Integer>(byName2);
		Comparator<Integer> byName =(Integer a, Integer b)-> b-a;
		TreeMap<Integer, String> sortByPoints = new TreeMap<Integer, String>(byName);
		int total = 0;

		for(int i = 0;i < n; i++){
			System.out.println(i + 1 + " Enter player and points?");
			String name = in.next();
			int points = in.nextInt();
			boolean invalidString = false;
			for(int j = 0; j < name.length(); j++){
				if(!((name.charAt(j) > 96 && name.charAt(j) < 123) || (name.charAt(j) > 64 && name.charAt(j) <92))){
					invalidString = true;
				}
			}
			while(invalidString){
				System.out.println(i + 1 + " Enter player and points?");
				name = in.next();
				points = in.nextInt();
				invalidString = false;
				for(int j = 0; j < name.length(); j++){
					if(!((name.charAt(j) > 96 && name.charAt(j) < 123) || (name.charAt(j) > 64 && name.charAt(j) <92))){
						invalidString = true;
					}
				}
			}
			total += points;
			name = name.toLowerCase();
			sortByName.put(name, points);
			sortByPoints.put(points, name);
		}
		in.close();
		int result = 0;
		System.out.println("Total: " + total);
		int count = 0;
		System.out.print("Sorted by name:");
		for(Map.Entry<String, Integer> entry : sortByName.entrySet()){
			System.out.print( entry.getKey().substring(0, 1).toUpperCase()+ entry.getKey().substring(1) + " " + entry.getValue());
			if(count != sortByName.size() -1){
				System.out.print(", ");
			}
			count++;
		}
		count = 0;
		System.out.println();
		System.out.print("Sorted by points:");
		for(Map.Entry<Integer, String> entry : sortByPoints.entrySet()){
			System.out.print(entry.getValue().substring(0, 1).toUpperCase()+ entry.getValue().substring(1) + " " + entry.getKey());
			if(count != sortByName.size() -1){
				System.out.print(", ");
			}
			count++;
		}
		System.out.println();

	}

}
