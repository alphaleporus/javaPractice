public class _74_search_2d_matrix {
    private boolean binarySearch(int[][] nums, int target, int start, int end){
        if(start > end){
            return false;
        }
        int cols = nums[0].length;
        int mid = (start + end)/2;
        if(target == nums[mid / cols][mid % cols]){
            return true;
        }else if(target < nums[mid / cols][mid % cols]){
            return binarySearch(nums, target, start, mid-1);
        }else{
            return binarySearch(nums, target, mid+1, end);
        }
    }


    public boolean search(int[][] nums, int target) {
        int start = 0;
        int end = nums.length * nums[0].length-1;
        return binarySearch(nums, target, start, end);
    }
}
