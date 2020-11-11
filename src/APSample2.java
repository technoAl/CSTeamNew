//public class APSample2 {
//	public static void main(String[] args){
//
//	}
//	/*
//	ZU17W4W8
//	AS
//	 */
//
//	/**
//	 * a) implementation of word checker
//	 * @param firstLetter
//	 * @param maxLength
//	 * @param n
//	 * @return
//	 */
//	public static boolean wordChecker(String firstLetter, int maxLength, int n){
//		int amountValid = 0;
//		for(int i = 0; i < n; i++){
//			String word = getWord();
//			if(word.length() <= maxLength && word.indexOf(firstLetter) == 0){
//				amountValid++;
//			}
//		}
//		return amountValid * 10 < n;
//	}
//
//	/*
//	b)
//	In order to add a precentage of threshold without touching the signature or overloading the method,
//	a private variable/field in the class of wordTester could be created.
//
//	private int threshold;
//
//	The constructor could be created to take the user input for the value in
//	i.e
//	public WordTester(int t){
//		threshold = t;
//	}
//	or the constructor could set it to a default value (i.e 10)
//
//	Then setters could be used to modify the threshold method, (getter could also be included but not necessary for thhis application)
//	public void setThreshold(int t){
//
//	}
//	This way, the user could modify thwhat thee threshold himself, and so it could change and not be stuck
//
//	Then the method wordChecker would have to be modified to use this new threshold variable. It could for example find the percentage
//	byb dividing the amount that follow the condition by the total number n. Then comparing with the threshold.
//	i.e.
//	return amount valid(double) / n (double) * 100.0 < threshold;
//
//	 */
//
//
//
//}
