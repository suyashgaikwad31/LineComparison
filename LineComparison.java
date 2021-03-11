import java.util.Scanner;
import java.lang.*;

public class LineComparision {
	// UC-4

	public void lineCompare(int diff) {

                switch(diff) {
                        case -1:
                                System.out.println("Line 2 is Longer than Line 1");
                                break;
                        case 0:
                                System.out.println("Both Lines are Equal");
                                break;
                        case 1:
                                System.out.println("Line 1 is Longer than Line 2");
                                break;
                        default:
                                System.out.println("Some error has occured, default case");
                                break;
                }

	}

	public float lengthComputation(int x1, int y1, int x2, int y2) {

		return ((float) Math.sqrt( (Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)) ));

	}

	public int[] input() {

                Scanner scan = new Scanner(System.in);
		int[] arr = new int[4];
                //Taking input
                System.out.print("Enter the point x1: ");
                arr[0] = scan.nextInt();
                System.out.print("Enter the point y1: ");
                arr[1] = scan.nextInt();
                System.out.println("(x1,y1) points of the line are: " + arr[0] + ", " + arr[1]);

                System.out.print("Enter the point x2: ");
                arr[2] = scan.nextInt();
                System.out.print("Enter the point y2: ");
                arr[3] = scan.nextInt();
                System.out.println("(x2,y2) point of the line 2 are: " + arr[2] + ", " + arr[3]);

		return arr;

	}

	public static void main(String[] args) {

		LineComparision obj = new LineComparision();

                //Taking input for line 1
		System.out.println("Please enter the point coordinates for line 1.");
		int[] line1_points = obj.input();

                //Taking input for line 2
		System.out.println("Please enter the point coordinates for line 2.");
                int[] line2_points = obj.input();

		//Computation for line 1
		Float length1 = obj.lengthComputation(line1_points[0], line1_points[1], line1_points[2], line1_points[3]);
		System.out.println("Length of the line 1 is: " + length1);

                //Computation for line 2
                Float length2 = obj.lengthComputation(line2_points[0], line2_points[1], line2_points[2], line2_points[3]);
                System.out.println("Length of the line 2 is: " + length2);

                int diff = length1.compareTo(length2);
		obj.lineCompare(diff);
	}
}
