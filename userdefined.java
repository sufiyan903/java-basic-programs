import java.util.Scanner;

public class userdefined {

    public static void findEvenOdd(int num) {
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else{
            System.out.println(num + " is odd");
    }

    public static void main(String args[]) {
        // Creating Scanner class object
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        // Reading value from the user
        int num = scan.nextInt();

        
        findEvenOdd(num);
    }
}
