
import java.util.Scanner;

public class lab13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(checkN(a));
	}

	public static boolean checkN(int a) {
		int r;
		while (a != 1) {
			r = a % 2;
			a = a / 2;
			if (r != 0) {
				return false;
			}
		}
		return true;
	}

}
