public class NumberSign {

	public static void main(String[] args) {
		int i = 123654654;
		System.out.println("Number is: " + i);
		if ((1 + (i >> 31) - (-i>>31)) == 0) {
			System.out.println("Given Number is 'Negative'");
		} else {
			System.out.println("Given Number is 'Positive'");
		}
	}
}