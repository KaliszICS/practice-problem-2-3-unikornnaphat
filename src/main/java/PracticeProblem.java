public class PracticeProblem {

	public static void main(String[] args) {
        // Example calls — students can test with different values
        System.out.println("Circle Area Test 1: " + circleArea(5.0));
        System.out.println("Circle Area Test 2: " + circleArea(10.0));
        System.out.println("Circle Area Test 3: " + circleArea(0.0));
        System.out.println("Circle Area Test 4: " + circleArea(2.5));
        System.out.println("Circle Area Test 5: " + circleArea(7.0));

        System.out.println();

        System.out.println("Minutes to Hours Test 1: " + minutesToHours(100));
        System.out.println("Minutes to Hours Test 2: " + minutesToHours(60));
        System.out.println("Minutes to Hours Test 3: " + minutesToHours(150));
        System.out.println("Minutes to Hours Test 4: " + minutesToHours(30));
        System.out.println("Minutes to Hours Test 5: " + minutesToHours(200));

        System.out.println();

        System.out.println("Simple Interest Test 1: " + simpleInterest(200.0, 10.0, 8));
        System.out.println("Simple Interest Test 2: " + simpleInterest(500.0, 5.0, 3));
        System.out.println("Simple Interest Test 3: " + simpleInterest(1000.0, 3.5, 5));
        System.out.println("Simple Interest Test 4: " + simpleInterest(300.0, 7.5, 1));
        System.out.println("Simple Interest Test 5: " + simpleInterest(0.0, 5.0, 4));

        System.out.println();

        System.out.println("Hypotenuse Test 1: " + hypotenuse(70.0, 1.75));
        System.out.println("Hypotenuse Test 2: " + hypotenuse(3.0, 4.0));
        System.out.println("Hypotenuse Test 3: " + hypotenuse(5.0, 12.0));
        System.out.println("Hypotenuse Test 4: " + hypotenuse(1.0, 1.0));
        System.out.println("Hypotenuse Test 5: " + hypotenuse(10.0, 0.0));
    }

    /**
     * Function 1: Calculate the area of a circle
     * Input: radius (double)
     * Output: area (double)
     */
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    /**
     * Function 2: Convert minutes to total hours and remaining minutes
     * Input: totalMinutes (int)
     * Output: formatted String e.g. "2 hours and 30 minutes"
     */
    public static String minutesToHours(int totalMinutes) {
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        return hours + " hours and " + minutes + " minutes";
    }

    /**
     * Function 3: Calculate the simple interest earned
     * Inputs: principal (double), annualRate (double as a percent e.g. 5.0 for 5%),
     *         years (int)
     * Output: interest earned (double)
     */
    public static double simpleInterest(double principal, double annualRate, int years) {
        double interest = principal * (annualRate / 100.0) * years;
        return interest;
    }

    /**
     * Function 4: Calculate the hypotenuse of a right triangle
     * Inputs: sideA (double), sideB (double)
     * Output: hypotenuse (double)
     */
    public static double hypotenuse(double sideA, double sideB) {
        double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
        return hypotenuse;
    }
}


    
