import java.util.Scanner;
import java.lang.Math.*;
public class CubesOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,temporary,sum = 0;
		System.out.println("Enter a number: ");
		Scanner scanner =  new Scanner(System.in);
		number = scanner.nextInt();
		while(number > 0){ 
			temporary = number %10; 
			sum += Math.pow(temporary,3); 
			number = number /10; 
		}
		System.out.println("Cubes of digits is :"+sum);
	}

}
