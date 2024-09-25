package assign04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author david chen
 * @author u6037704
 * @version 9.24.2024
 * @category CS1420 Assignment04
 */

public class MethodPractice {

	public static void main(String[] args) {
//		System.out.println(litersToGallons(20));
//		System.out.println(sumInRange(1,10));
//		try {
//            // Create a scanner object that reads from a file
//			Scanner filenameInput = new Scanner(System.in);
//			System.out.println("Enter a file name with path: ");
//			String filename = filenameInput.nextLine();
//            File file = new File(filename);
//            Scanner scanner = new Scanner(file);
//
//            // Count integer zeros
//            int zeroCount = countIntegerZeros(scanner);
//            System.out.println("Number of integer zeros: " + zeroCount);
//
//            // Close the scanner
//            scanner.close();
//        } 
//		catch (FileNotFoundException e) {
//            System.out.println("File not found: " + e.getMessage());
//        }

	}
	
	/**
	 * This method will convert a double-type number in unit liter round down into a int-type 
	 * number in unit gallon
	 * 
	 * @param liters unit (double)
	 * @return gallon unit (int)
	 */
	public static int litersToGallons(double liters) {
		int gallons;
		gallons = (int) (liters / 3.785);
		return gallons;
	}
	
	/**
	 * This method will sum all the values that are inside the range of 2 numbers of user's choice, 
	 * including the starting and ending values. Assume the starting value is always less than the 
	 * ending value.
	 * 
	 * @param (int) startVal, the number that the user wants to start summing.
	 * @param (int) endVal, the number that user wants to stop summing at.
	 * @return sum of the value in the rage [startVal, endVal]
	 */
	public static int sumInRange(int startVal, int endVal) {
		int sum = startVal;
		
		if (startVal == endVal)
			return startVal;
		
		while(startVal != endVal) {
			int nextVal = startVal + 1;
			sum = sum + nextVal;
			startVal = nextVal;
		}
		return sum;
	}
	
//	public static String shiftCipher(String message, int shiftAmount) {
//	}
	
	/**
	 * This method will find the number of integer 0s that exist in the scanner object that was 
	 * provided by the user
	 * 
	 * @param scanner of a file
	 * @return int-type, the count of 0s inside the file.
	 */
	public static int countIntegerZeros(Scanner file) {
		int zeroCount = 0;
        while (file.hasNext()) {
            if (file.hasNextInt()) {
                int number = file.nextInt();
                if (number == 0) {
                    zeroCount++;
                }
            } 
            else {
                file.next();
            }
        }
        return zeroCount;
	}
	
	public static String subsequenceString(char[] charactors) {
		
		return null;
	}
}
