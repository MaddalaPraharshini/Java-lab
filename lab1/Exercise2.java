import java.util.Scanner;
public class TrafficLights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String light;
		System.out.println("Enter a light: ");
		Scanner scanner = new Scanner(System.in);
		light = scanner.next();
		switch(light) {
		case "green":
			System.out.println("Go!");
			break;
		case "yellow":
			System.out.println("Ready!");
			break;
		case "red":
			System.out.println("Stop!");
			break;
		default :
			System.out.println("Enter a valid command light");
		}

	}
}
