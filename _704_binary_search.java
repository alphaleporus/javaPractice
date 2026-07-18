public class _704_binary_search {
    private int binarySearch(int[] nums, int target, int start, int end){
        int mid = (start + end)/2;
        while(start!=end){
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                return binarySearch(nums, target, start, mid);
            }else{
                return binarySearch(nums, target, mid+1, end);
            }
        }
        return -1;
    }


    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return binarySearch(nums, target, start, end);
    }
}
