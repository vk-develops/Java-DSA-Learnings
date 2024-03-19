package ArrayProblems;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//Find the larget number in the array
//Easy

public class ArraySecondLargestNumber {

    public static int[] getSecondOrderElements(int n, int []a) {
        Arrays.sort(a);

        int res[] = new int[2];
        int min = a[1];
        int max = a[a.length - 2];

        res[0] = max;
        res[1] = min;

        return res;

    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 4, 7};
        int n = arr.length;

        int res[] = getSecondOrderElements(n, arr);
        
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }   
}
