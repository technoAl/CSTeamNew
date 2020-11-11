import java.util.*;
import java.io.*;

public class clown {
    public static void main(String[] args) throws Exception {
	long startTime = System.currentTimeMillis();
	BufferedReader in = new BufferedReader(new FileReader("stonks.in"));
	int n = Integer.parseInt(in.readLine());
	int[] p = new int[n];

	for(int i = 0; i < n; i++) {
	    p[i] = Integer.parseInt(in.readLine());
	}
	in.close();

	int max = 0, pos = 0, queso;

	for(int i = 0; i < n; i++) {
	    queso = 0;
	    for(int k = i + 1; k < n; k++){
		if(p[i] <= p[k]){
		    queso += 1;
		}
	    }
	    if(queso > max){
		max = queso;
		pos = i;
	    }
	}
	PrintWriter out = new PrintWriter("stonks.out");
	out.println(pos + 1);
	out.close();
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println(totalTime/1000.0);
    }
}
