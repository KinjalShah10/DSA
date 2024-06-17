package Search;
public class Floor {
    public static void main(String[] args) {
        int[] arr = {1,8,55,4,9,7,5};
        int target = 10;
        int ans = small(arr,target);
        System.out.println(ans);

        
    }

    //greatest no. <= target
    static int small(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        int mid= start+(end-start)/2;


        while(start<=mid){
            if (target<mid) {
                mid=mid-1;

                
            }
            else if (target>mid){
               mid=mid+1; 
            }
            else{
                return mid;
            }
        }
        return end;


    }
    
}
