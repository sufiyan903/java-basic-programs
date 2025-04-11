public class CheckedExceptionDemolb5 {
    public static void main(String[] args) {
        try {
            Class.forName("nonExistentClass"); // Use "Class" instead of "class"
        } catch (ClassNotFoundException e) { // Correct the exception name
            System.out.println("Checked exception caught: " + e.getMessage());
        }
    }
}
