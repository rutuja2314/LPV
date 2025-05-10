import java.util.*;
import java.util.stream.*;

public class ParallelOperations {

    public static long parallelSum(List<Integer> list) {
        return list.parallelStream().mapToLong(Integer::longValue).sum();
    }

    public static int parallelMax(List<Integer> list) {
        return list.parallelStream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
    }

    public static int parallelMin(List<Integer> list) {
        return list.parallelStream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
    }

    public static double parallelAverage(List<Integer> list) {
        return list.parallelStream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        long sum = parallelSum(list);
        int max = parallelMax(list);
        int min = parallelMin(list);
        double average = parallelAverage(list);

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
