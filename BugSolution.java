public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = 0;
        try {
            k = i / j; 
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!"); // Handle the exception gracefully
            // You might want to take some action here, such as logging the error or returning a default value
        }
        System.out.println(k); //This will now either print the result or 0
    }
}