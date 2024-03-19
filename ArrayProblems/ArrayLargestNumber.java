package ArrayProblems;

/**
 * ArrayLargestNumber
 */

//https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//Find the larget number in the array

public class ArrayLargestNumber {

    static int largestElement(int[] arr, int n) {
        // Write your code here.

        int max = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 4, 7};
        int n = arr.length;

        int res = largestElement(arr, n);
        System.out.println(res);
    }
}