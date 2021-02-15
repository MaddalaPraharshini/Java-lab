
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,i=0,first = 0, second = 1,sum=0;
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for(i =0; i < number;i++) {
			sum = first + second;
			// System.out.println(sum);
			first = second;
			second = sum;
		}
		System.out.println("nth number is : "+sum);
	}

}
