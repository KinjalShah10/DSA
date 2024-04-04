public class resize_array {
    public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int[] resize(int arr[],int capacity){
        int temp[]=new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];


        }
        arr = temp;
        return arr;
    }
    public static void main(String[] args) {
        resize_array arrUtil = new resize_array();
        //arrUtil.printArray(new int [] {5,1,2,9,10});
        int[] original = new int[] {5,1,2,9,10};
        System.out.println("The size of original array - "+ original.length);
        original=arrUtil.resize(original, 10);
        System.out.println("The size of original array after resize - "+ original.length);
    }
}
