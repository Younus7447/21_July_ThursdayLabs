import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		int rem,i = 0;
		
		while(a!=0) {
			rem = a%10;
			i = i * 10 + rem;
			a = a/10;
		}
		System.out.print("output: " + i);
	}
}