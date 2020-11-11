import java.util.*;
import java.io.*;

public class sum {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("sum.in"));
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		PrintWriter pw = new PrintWriter(new File("sum.out"));
		pw.write(a + b);
		pw.close();
	}
}
