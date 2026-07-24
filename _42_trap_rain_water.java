public class _42_trap_rain_water {
    public int trap(int[] height) {
        int maxLeft = 0;
        int maxRight = 0;
        int left = 0;
        int right = height.length-1;
        int water = 0;
        while(left<right){
            if(height[left]<height[right]){
                maxLeft = Math.max(maxLeft , height[left]);
                water += maxLeft - height[left];
                left++;
            }
            else{
                maxRight = Math.max(maxRight , height[right]);
                water += maxRight - height[right];
                right--;
            }
        }
        return water;
    }
}
