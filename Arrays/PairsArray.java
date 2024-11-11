package Arrays;

public class PairsArray {

    public static void pair(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("( " + arr[i] + "," + arr[j] + " )");
            }
            System.out.println();
        }
    }

    public static void printSubArrays(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print("( " + arr[k] + " )");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void printSubArraysum(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print("( " + arr[k] + " )");
                }
                System.out.print(" = " + sum);

                System.out.println();
                maxSum = Math.max(maxSum, sum);
            }
            System.out.println();
        }

        System.out.println(" Max Sum = " + maxSum);
    }

    public static void prefixSumArray(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println(maxSum);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        // pair(arr);
        // printSubArrays(arr);
        // printSubArraysum(arr);
        prefixSumArray(arr);
    }
}
