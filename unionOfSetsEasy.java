import java.util.TreeSet;

public class unionOfSetsEasy {
    public static TreeSet<Integer> createUnion(int[] nums1, int[] nums2){
        TreeSet<Integer> union = new TreeSet<>();
        for(int num: nums1) union.add(num);
        for(int num: nums2) union.add(num);
        return union;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,5,2,2,3,4,5};
        int[] nums2 = {3,4,6,7,8};
        System.out.println(createUnion(nums1, nums2));
    }
}


