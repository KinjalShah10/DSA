public class RemoveEvenInteger {

    public static void printArray(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();

    }
    public static int[] RemoveEven(int[] arr){

        // Logic is we make one array or odd ingers and than print that array.
        int oddCount = 0;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]%2 != 0){
                oddCount++;
            }
        }

        //odd count is taken as a refrence for making a new array
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0){
                result[idx]= arr[i];
                idx++;

            } 
        }
        return result;
    }
    public static void main(String[] args) {
        int arr [] = {3,2,4,7,10,6,5};
        printArray(arr);
        int[]result = RemoveEven(arr);
        printArray(result);
    }
}
