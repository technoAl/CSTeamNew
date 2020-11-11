//import java.util.*;
//import java.io.*;
//
//public class Veitch {
//	public static void main(String[] args){
//		Scanner in = new Scanner("veitch.in");
//		String[] inputs = new String[5];
//		for(int i =0; i < 5; i++){
//			inputs[i] = in.nextLine();
//			System.out.println(process(inputs[i]));
//		}
//
//
//	}
//
//	static String process(String input){
//		String result = "";
//		int decimal=Integer.parseInt(input,16);
//		String veitch = Integer.toBinaryString(decimal);
//		int[][] grid = new int[4][4];
//		int count = 0;
//		for(int i = 0; i < 4; i++){
//			for(int j = 0; j < 4; j++){
//				if(veitch.charAt(count) == '0'){
//					grid[i][j] = 0;
//				}else{
//					grid[i][j] = 1;
//				}
//				count++;
//			}
//		}
//		//rule 1 hardcoded
//		int index = 0;
//		if(grid[index][0] == 1 && grid[index][1] == 1 && grid[index][2] == 1 && grid[index][3] == 1 &&
//			grid[index+1][0] == 1 && grid[index+1][1] == 1 && grid[index+1][2] == 1 && grid[index+1][3] == 1)
//			result += "B";
//		index = 2;
//		if(grid[index][0] == 1 && grid[index][1] == 1 && grid[index][2] == 1 && grid[index][3] == 1 &&
//				grid[index+1][0] == 1 && grid[index+1][1] == 1 && grid[index+1][2] == 1 && grid[index+1][3] == 1)
//			result += "~B";
//		index = 0;
//		if(grid[index][0] == 1 && grid[index][1] == 1 && grid[index][2] == 1 && grid[index][3] == 1 &&
//				grid[index+3][0] == 1 && grid[index+3][1] == 1 && grid[index+3][2] == 1 && grid[index+3][3] == 1)
//			result += "~D";
//		index = 1;
//		if(grid[index][0] == 1 && grid[index][1] == 1 && grid[index][2] == 1 && grid[index][3] == 1 &&
//				grid[index+1][0] == 1 && grid[index+1][1] == 1 && grid[index+1][2] == 1 && grid[index+1][3] == 1)
//			result += "D";
//
//		index = 0;
//		if(grid[0][index] == 1 && grid[1][index] == 1 && grid[2][index] == 1 && grid[3][index] == 1 &&
//				grid[0][index+1] == 1 && grid[1][index+1] == 1 && grid[2][index+2] == 1 && grid[3][index+1] == 1)
//			result += "A";
//		index =2;
//		if(grid[0][index] == 1 && grid[1][index] == 1 && grid[2][index] == 1 && grid[3][index] == 1 &&
//				grid[0][index+1] == 1 && grid[1][index+1] == 1 && grid[2][index+2] == 1 && grid[3][index+1] == 1)
//			result += "~A";
//		index = 0;
//		if(grid[0][index] == 1 && grid[1][index] == 1 && grid[2][index] == 1 && grid[3][index] == 1 &&
//				grid[0][index+3] == 1 && grid[1][index+3] == 1 && grid[2][index+3] == 1 && grid[3][index+3] == 1)
//			result += "~C";
//		index =1;
//		if(grid[0][index] == 1 && grid[1][index] == 1 && grid[2][index] == 1 && grid[3][index] == 1 &&
//				grid[0][index+1] == 1 && grid[1][index+1] == 1 && grid[2][index+2] == 1 && grid[3][index+1] == 1)
//			result += "C";
//
//	}
//
//
//}
