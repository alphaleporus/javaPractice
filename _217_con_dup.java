import java.util.HashMap;
public class _217_con_dup {
    public boolean containsDupe(int[] nums){
        HashMap<Integer, Integer> VisitedCount = new HashMap<>();
        for(int num:nums){
            VisitedCount.put(num, VisitedCount.getOrDefault(num, 0) + 1);
            if(VisitedCount.get(num)>1){
            return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        _217_con_dup obj = new _217_con_dup();
        int[] nums = {1,2,3,1};
        System.out.println(obj.containsDupe(nums));
    }
}
