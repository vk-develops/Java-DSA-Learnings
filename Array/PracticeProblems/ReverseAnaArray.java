package Array.PracticeProblems;

public class ReverseAnaArray {

    public static int[] reverseArrayRecursionHelper(int arr[], int start, int end){
        if(start >= end){
            return arr;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArrayRecursionHelper(arr, start + 1, end - 1);

        return arr;
    }

    public static int[] reverseArrayUsingRecursion(int arr[]){
        int res[] = reverseArrayRecursionHelper(arr, 0, arr.length - 1);
        return res;
    }

    public static int[] reverseArray(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }


    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 2, 3, 4};
        printArray(arr);

        // System.out.println("");
        // int res[] = reverseArray(arr);
        // printArray(res);

        System.out.println("");
        int res[] = reverseArrayUsingRecursion(arr);
        printArray(res);
    }
}
