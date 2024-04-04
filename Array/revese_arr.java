public class revese_arr 
{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int [] numbers,int start,int end){
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end]= temp;
            start++;
            end--;

            
        }
    }

        
    

    public static void main(String[] args) {
        int [] numbers= {3,2,4,7,10,6,5};
        printArray(numbers);
        reverse(numbers, 0, numbers.length-1);
        printArray(numbers);
    }
}