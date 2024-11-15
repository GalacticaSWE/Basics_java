package defaultPackage;

import java.util.Scanner;

public class IOScanner{  
	static Scanner scanner = new Scanner(System.in);
		
		static String StringInput() {	
			return scanner.nextLine();
		}
		static Integer IntegerInput() {
	                int value = scanner.nextInt();
	                scanner.nextLine(); // Clear the newline character
	                return value;

	    }


		public void close() {
			scanner.close();
		}
	}
