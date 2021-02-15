import java.util.Arrays;
import java.util.Scanner;

public class randomPrgm {
	public static int secondSmallest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		System.out.println("Second smallest in given array is:" + secondSmallest(a, 6));
	}
}
