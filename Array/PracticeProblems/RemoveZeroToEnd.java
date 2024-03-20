package Array.PracticeProblems;

public class RemoveZeroToEnd {

    public static int[] moveZeroToEnd(int arr[]){
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp  = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[j] != 0){
                j++;
            }
        }

        return arr;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 0, 7, 0, 3, 4};
        printArray(arr);

        System.out.println("");
        int res[] = moveZeroToEnd(arr);
        printArray(res);
    }
}
