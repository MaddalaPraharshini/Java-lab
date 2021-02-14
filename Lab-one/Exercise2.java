package day3;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select color");
		Scanner n = new Scanner(System.in);
		String a = n.next();
		
		switch (a) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("ready");
			break;
		case "Green":
			System.out.println("go");
			break;
		default:
			System.out.println("Not a traffic light!!!!!");
			break;
		}
	}

}
