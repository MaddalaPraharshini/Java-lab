
import java.util.*;

public class randomPrgm {

	public static int getsorted(int[] inputOfArray) {
		int arrayLength = inputOfArray.length;
		System.out.println(arrayLength);
		int[] outputOfArray = new int[inputOfArray.length];
		for (int i = 0; i < arrayLength; i++) {
			StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append(Integer.toString(inputOfArray[i]));
			stringBuffer.reverse();

			outputOfArray[i] = Integer.parseInt(stringBuffer.toString());
		}
		Arrays.sort(outputOfArray);
		for (int j : outputOfArray) {
			System.out.print(j + " ");
		}

		return 0;
	}

	public static void main(String[] args) {
		int input[] = { 15,13,1,12,3,16,9};

		getsorted(input);

	}

}
