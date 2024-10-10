 public class Aggregate {

    // Sum function
    public static int sumArray(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Min function
    public static int minArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int minimum = arr[0];
        for (int num : arr) {
            if (num < minimum) {
                minimum = num;
            }
        }
        return minimum;
    }

    // Max function
    public static int maxArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int maximum = arr[0];
        for (int num : arr) {
            if (num > maximum) {
                maximum = num;
            }
        }
        return maximum;
    }

    // Avg function
    public static double avgArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int total = sumArray(arr);
        return (double) total / arr.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Sum: " + sumArray(array));  // Output: 15
        System.out.println("Min: " + minArray(array));  // Output: 1
        System.out.println("Max: " + maxArray(array));  // Output: 5
        System.out.println("Avg: " + avgArray(array));  // Output: 3.0
    }
    
}