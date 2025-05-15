import java.util.Arrays;
import java.util.Scanner;

public class SortedCumulativeSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the number of elements as input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Read the elements into the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Compute and print the cumulative s
    }
}