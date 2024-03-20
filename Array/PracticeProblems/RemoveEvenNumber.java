package Array.PracticeProblems;

public class RemoveEvenNumber {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] removeEvenNumbers(int arr[]){
        int oddCount=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }

        int index = 0;
        int result[] = new int[oddCount];

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 2, 3, 4};
        printArray(arr);

        System.out.println("");
        int res[] = removeEvenNumbers(arr);
        printArray(res);
    }
}
