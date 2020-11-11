import java.util.Scanner;

public class Goats2024Problem5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int z = 0; z < 2; z++) {
			System.out.println("Enter size:");
			String[] input = in.nextLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			System.out.println("Enter k");
			int k = in.nextInt();
			in.nextLine();
			int solutions = 0;
			if (n>k && m>k && Math.max((n - k + 1) * (m - k + 1),0) > 0) {
				solutions = Math.max((n - k + 1) * (m - k + 1),0);
			}
			if (solutions>0) {
				int[][] matrix = new int[m][n];
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						matrix[i][j] = (int) (Math.random() * 10.0);
						System.out.print(matrix[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				for (int i = 0; i < m - k + 1; i++) {
					for (int j = 0; j < n - k + 1; j++) {
						for (int a = i; a < i + k; a++) {
							for (int b = j; b < j + k; b++) {
								System.out.print(matrix[a][b] + " ");
							}
							System.out.println();
						}
						System.out.println();
					}
				}
			}
//            System.out.println(k+" "+m+" "+n);
			System.out.println("Solutions:" +solutions);
		}
	}

}