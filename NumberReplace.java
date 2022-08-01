class NumberReplace {

	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				// First Condition
				System.out.println(i + " - Deep");
			}
			if(i%5==0) {
				// Second Condition
				System.out.println(i + " - Tech");
			}
			if(i%3==0 && i%5==0) {
				// Third Condition
				System.out.println(i + " - DeepTech");
			}
			if(i%3!=0 && i%5!=0) {
				// Rest of Numbers
				System.out.println(i);
			}
		}

	}

}