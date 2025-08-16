public class TwoSumThree {
    public static int[] TwoSum(int[]a, int target){
        for(int i = 0; i<a.length; i++){
            for(int j = i; j< a.length; j++){
                if(a[i]+a[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
