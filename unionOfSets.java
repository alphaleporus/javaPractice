import java.util.ArrayList;

public class unionOfSets {
    public static ArrayList<Integer> createUnion(int[]nums1, int[] nums2, int l1, int l2){
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i < l1 && j < l2) {
            if (nums1[i] == nums2[j] && !union.contains(nums1[i])) {
                union.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j] && !union.contains(nums2[j])) {
                union.add(nums2[j]);
                j++;
            } else if (nums1[i] < nums2[j] && !union.contains(nums1[i])) {
                union.add(nums1[i]);
                i++;
            }else{ i++;
            j++;}
        }

        while(i < l1){
            if(!union.contains(nums1[i])){
                union.add(nums1[i]);
            }
            i++;
        }

        while(j < l2){
            if(!union.contains(nums2[j])){
                union.add(nums2[j]);
            }
            j++;
        }
        return union;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,1,2,2,3,4,5};
        int[] nums2 = {3,4,6,7,8};
        int l1 = nums1.length;
        int l2 = nums2.length;
        System.out.println(createUnion(nums1, nums2, l1, l2));
    }
}