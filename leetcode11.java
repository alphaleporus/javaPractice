public class leetcode11 {
    public static int maxArea(int[] height) {
        try {
            int max = Integer.MIN_VALUE;
            int i = 0;
            int j = height.length - 1;
            while (i < j) {
                int area = (j - i) * Math.min(height[i], height[j]);
                max = Math.max(max, area);
                if (height[i] < height[j]) {
                    i++;
                } else {
                    j--;
                }
            }
            return max;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}


