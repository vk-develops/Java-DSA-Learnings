package Array.PracticeProblems;

public class ReverseAnaArray {

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

        System.out.println("");
        int res[] = reverseArray(arr);
        printArray(res);
    }
}
