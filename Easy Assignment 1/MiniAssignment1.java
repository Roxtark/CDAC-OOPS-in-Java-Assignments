
public class MiniAssignment1 {

	 public static void oddNumbers() {
	        for (int i = 1; i <= 1000; i++) {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	        }
	    }

	    public static void evenNumbers() {
	        for (int i = 1; i <= 500; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
	    }

	    public static void everySeventhNumber() {
	        for (int i = 7; i <= 200; i = i + 7) {
	            System.out.println(i);
	        }
	    }

	    public static void patternOne() {
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	    public static void patternTwo() {
	        for (int i = 5; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

	    public static void patternThree() {
	        int num = 1;

	        for (int i = 1; i <= 4; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }
	    }

	    public static void patternFour() {
	        for (int i = 1; i <= 6; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void patternFive() {
	        for (int i = 6; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {

	        oddNumbers();

	        // evenNumbers();
	        // everySeventhNumber();
	        // patternOne();
	        // patternTwo();
	        // patternThree();
	        // patternFour();
	        // patternFive();
	    }
	}