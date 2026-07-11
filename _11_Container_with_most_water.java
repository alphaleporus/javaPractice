public class _11_Container_with_most_water {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max = 0;
        while(left<right){
            int x = right - left;
            int y = Math.min(height[left], height[right]);
            int area = x*y;
            max = Math.max(max, area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
