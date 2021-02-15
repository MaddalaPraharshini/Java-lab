import java.util.*;

public class lab11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value: ");
		number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
