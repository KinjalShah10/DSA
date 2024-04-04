public class array {


    //--------------Printing------------------------
    public void print_arr(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    //----------------Insertion-----------------------
    public void demo(){
        int arr[] = new int[5]; //default values
        print_arr(arr); //prints array
        arr[0]=67;
        arr[1]=1;
        arr[2]=7;
        arr[4]=64;
        arr[3]=2;


    //----------updation-------------------------
        // arr[4]=97;
        // print_arr(arr);


    }
    public static void main(String[] args) {
        array up_arr = new array();
        up_arr.demo();

        
    }
    
}
