public class Move_zeros {
    
    public void printArray (int arr []){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
        
    }

    public void ArrayDemo(){
        int [] arr = {8,1,0,2,1,0,3};
        printArray(arr);
        MoveZeros(arr,arr.length);
        printArray(arr);


    }

    public void MoveZeros(int arr [], int n){
        int j = 0; //focus on zeroth elements.
        // i focus on non zero elements
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0 && arr[j] ==0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            }
            if(arr[j]!=0){
            j++;
            }
        }

}  


public static void main(String[] args) {
    Move_zeros arrUtil = new Move_zeros();
    arrUtil.ArrayDemo();
}
}