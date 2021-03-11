import java.util.Scanner;
import java.lang.*;

public class LineComparision {
	//This is UC-1

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//Taking input
		System.out.print("Enter the point x1: ");
		int x1 = scan.nextInt();
		System.out.print("Enter the point y1: ");
		int y1 = scan.nextInt();
		System.out.println("(x1,y1) points of the line are: " + x1 + ", " + y1);

		System.out.print("Enter the point x2: ");
		int x2 = scan.nextInt();
		System.out.print("Enter the point y2: ");
		int y2 = scan.nextInt();
		System.out.println("(x2,y2) point of the line are: " + x2 + ", " + y2);

		//Computation
		float length = (float) Math.sqrt( (Math.pow((x2 - x1),2) + Math.pow((y2-y1),2)) );
		System.out.println("Length of the line is: " + length);
	}
}
