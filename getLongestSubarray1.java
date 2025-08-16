public class getLongestSubarray1 {
    public static int getLongestSubarray1(int[]a, long k){
        int n = a.length;
        int sum = 0;
        int r = 0;
        for(int i =0; i < n ; i++){
            for(int j = i; j<n ; j++){
                sum += a[j];
                if(sum == k){
                    r = Math.max((j-i +1), r);
                }
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int[] a = {-1, 1, 1};
        long k = 1;
        System.out.println(getLongestSubarray1(a, k));
    }
}
