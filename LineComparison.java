import java.util.Scanner;
import java.lang.*;

public class LineComparision {
	// UC-2

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//Taking input for line 1
		System.out.print("Enter the point x1: ");
		int x1 = scan.nextInt();
		System.out.print("Enter the point y1: ");
		int y1 = scan.nextInt();
		System.out.println("(x1,y1) points of the line 1 are: " + x1 + ", " + y1);

		System.out.print("Enter the point x2: ");
		int x2 = scan.nextInt();
		System.out.print("Enter the point y2: ");
		int y2 = scan.nextInt();
		System.out.println("(x2,y2) point of the line 1 are: " + x2 + ", " + y2);

                //Taking input for line 2
                System.out.print("Enter the point x3: ");
                int x3 = scan.nextInt();
                System.out.print("Enter the point y3: ");
                int y3 = scan.nextInt();
                System.out.println("(x3,y3) points of the line 2 are: " + x3 + ", " + y3);

                System.out.print("Enter the point x4: ");
                int x4 = scan.nextInt();
                System.out.print("Enter the point y4: ");
                int y4 = scan.nextInt();
                System.out.println("(x4,y4) point of the line 2 are: " + x4 + ", " + y4);

		//Computation for line 1
		Float length1 = (float) Math.sqrt( (Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)) );
		System.out.println("Length of the line 1 is: " + length1);

                //Computation for line 2
                Float length2 = (float) Math.sqrt( (Math.pow((x4 - x3),2) + Math.pow((y4 - y3),2)) );
                System.out.println("Length of the line 2 is: " + length2);

		System.out.println(length1.equals(length2));
	}
}
