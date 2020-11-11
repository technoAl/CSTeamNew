import java.io.*;
import java.util.*;

public class dumplingWriter {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("dumplings.in");
		Random rand = new Random();
		int randomN = (int)(rand.nextDouble() * 300.0) + 700;
		int randomX = (int)(rand.nextDouble() * 100000.0) + 100;
		out.println(randomN + " " + randomX);
		for(int i = 0; i < randomN; i++){
			out.println((int)(rand.nextDouble() * (randomX)));
		}
		out.close();

	}
}
