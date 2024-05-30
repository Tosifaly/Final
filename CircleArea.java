public class CircleArea {

    // Declare a constant for PI using the final keyword
    private static final double PI = 3.141592653589793;

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        // Example radius
        double radius = 5.0;
        
        // Calculate area
        double area = calculateArea(radius);
        
        // Print the area
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}
