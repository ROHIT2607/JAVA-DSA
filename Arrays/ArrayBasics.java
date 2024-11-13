
public class ArrayBasics {

    public static void ReverseArray(int arr[]) {
        int start = 0;
        // int n = arr.length;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int kadanes(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (cs < 0) {
                cs = 0;
            }
            cs += arr[i];
            ms = Math.max(cs, ms);
        }
        return ms;
    }

    public static int trappedRainWater(int arr[]) {
        int n = arr.length;
        // Calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        // Calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        // Calculate Water level = min(leftBoundary, rightBoundary)
        // Trapped Water = water level - height
        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        return trappedWater;

    }

    public static boolean findRepeated(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int searchInRoatetedSortedArray(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[end] >= target && arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void triplet(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int newArr[] = new int[3];
                    if ((arr[i] + arr[j] + arr[k] == 0) && (arr[i] != arr[j])
                            && (arr[j] != arr[k] && (arr[i] != arr[k]))) {
                        newArr[0] = arr[i];
                        newArr[1] = arr[j];
                        newArr[2] = arr[k];
                        PrintArray(newArr);
                    }
                }
            }
        }
    }

    public static int buyAndSellStocks(int arr[]) {
        int buyPrice = arr[0];
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            int sellPrice = arr[i];
            int currProfit = sellPrice - buyPrice;
            profit = Math.max(profit, currProfit);
            buyPrice = Math.min(buyPrice, sellPrice);
        }

        return profit;
    }

    public static void spiralMatrix(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        // System.out.println(endRow);
        // System.out.println(endCol);

        while (startRow <= endRow && startCol <= endCol) {

            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(arr[endRow][j] + " ");
            }

            // Left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(arr[i][startCol] + " ");
            }

            // System.out.println();

            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
    }

    public static boolean staireCaseSearch(int arr[][], int target) {
        int row = arr.length - 1;
        int col = 0;

        while (col < arr[0].length && row >= 0) {
            if (arr[row][col] == target) {
                return true;
            }

            else if (arr[row][col] < target) {
                col++;
            } else {
                row--;
            }
        }

        return false;
    }

    public static int countElements(int arr[][], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumOf2ndRow(int arr[][]) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[2][j];
        }
        return sum;
    }

    public static void transposeMatrix(int matrix[][]) {
        int newArr[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newArr[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        // PrintArray(arr);
        // ReverseArray(arr);
        // PrintArray(arr);
        // System.out.println(kadanes(arr));

        // System.out.println(trappedRainWater(arr));
        // System.out.println(findRepeated(arr));
        // System.out.println(searchInRoatetedSortedArray(arr, 0));
        // triplet(arr);
        // System.out.println(buyAndSellStocks(arr));
        // spiralMatrix(arr);
        // System.out.println(staireCaseSearch(arr, 333));
        // System.out.println(countElements(arr, 45));
        // System.out.println(sumOf2ndRow(arr));
        transposeMatrix(arr);
    }
}
