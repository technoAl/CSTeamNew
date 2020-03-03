//Code by Alex Sun
public class RecursiveTester {
	public static void main(String[] args){
		System.out.println(evenProducts(-1));
		System.out.println(evenProducts(0));
		System.out.println(evenProducts(1));
		System.out.println(evenProducts(2));
		System.out.println(evenProducts(3));
		System.out.println(evenProducts(4));
		System.out.println(evenProducts(8));
	}

	public static int evenProducts(int n){
		if(n < 1) {
			return 0;
		} else if(n == 1){
			return 2;
		}else{
			return (n * 2) * evenProducts(n-1);
		}

	}
}
