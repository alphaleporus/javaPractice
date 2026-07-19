public class _74_search_2d_matrix {
    private int binarySearch(int[][] nums, int target, int start, int end){
        int cols = nums[0][0];
        int mid = (start + end)/2;
        while(start!=end){
            if(target == nums[mid / cols][mid % cols]){
                return mid;
            }else if(target < nums[mid / cols][mid % cols]){
                return binarySearch(nums, target, start, mid);
            }else{
                return binarySearch(nums, target, mid+1, end);
            }
        }
        return -1;
    }


    public int search(int[][] nums, int target) {
        int start = nums[0][0];
        int end = nums[nums.length-1][nums[0].length-1];
        return binarySearch(nums, target, start, end);
    }
}
