import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] input = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        // Initialize the map with keys 1 to 9 and default count 0
        Map<Integer, Integer> multiplesCount = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }

        // Count how many numbers are divisible by each number from 1 to 9
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiplesCount.put(i, multiplesCount.get(i) + 1);
                }
            }
        }

        System.out.print("Output: {");
        for (Map.Entry<Integer, Integer> entry : multiplesCount.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue()+" ");
        }
        System.out.print("}");
        scanner.close();
    }
}
