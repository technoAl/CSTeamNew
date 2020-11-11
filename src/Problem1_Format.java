public class Problem1_Format {

	public static void main(String args[]) {

		// Code Tester
		if(commaify(400).equals("400"))
			System.out.println("CORRECT");
		else
			System.out.println("INCORRECT");
		if(commaify(1729).equals("1,729"))
			System.out.println("CORRECT");
		else
			System.out.println("INCORRECT");
		if(commaify(12).equals("12"))
			System.out.println("CORRECT");
		else
			System.out.println("INCORRECT");
		if(commaify(5).equals("5"))
			System.out.println("CORRECT");
		else
			System.out.println("INCORRECT");
		if(commaify(123282).equals("123,282"))
			System.out.println("CORRECT");
		else
			System.out.println("INCORRECT");
		if(commaify(4829271).equals("4,829,271"))
			System.out.println("CORRECT");
		else
			System.out.println("INCORRECT");
		if(commaify(123456789).equals("123,456,789"))
			System.out.println("CORRECT");
		else
			System.out.println("INCORRECT");
		if(commaify(0).equals("0"))
			System.out.println("CORRECT");
		else
			System.out.println("INCORRECT");
		if(commaify(129302832).equals("129,302,832"))
			System.out.println("CORRECT");
		else
			System.out.println("INCORRECT");

	}

	// Implement this function
	public static String commaify (int n){
		String str = Integer.toString(n);
		String result = "";
		int counter = 0;
		if(n == 0){
			return "0";
		}
		while(n > 0){
			counter++;
			int lastDigit = n % 10;
			result = Integer.toString(lastDigit) + result;
			if(counter % 3 == 0 && n > 10){
				result = "," + result;
			}
			n/=10;
		}
		return result;
	}
}
