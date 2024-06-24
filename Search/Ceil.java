
public class Ceil {
    public static void main(String[] args) {
        int[] arr = {1,8,55,4,9,7,5};
        int target = 10;
        int ans = celing(arr,target);
        System.out.println(ans);

        
    }

    //smallest no. greater than = to target
    static int celing(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        
        
        while(start<=end){
            int mid= start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;

                
            }
            else if (target>arr[mid]){
               start=mid+1; 
            }
            else{
                return mid;
            }
        }
        return start;


    }
    
}
