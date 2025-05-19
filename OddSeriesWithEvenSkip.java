import java.util.Scanner;

public class OddSeriesWithEvenSkip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        int count = (a % 2 == 0) ? a - 1 : a;  //As the problem statement says to print n-1 number of odd numbers if a is odd

        System.out.print("Output: ");
        for (int i = 0; i < count; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
