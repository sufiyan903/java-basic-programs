public class UncheckedExceptionDemo2 {
    public static void main(String[] args) {
        try {
            int numr = 10;
            int denomr = 0;
            int result = numr / denomr;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
    }
}
