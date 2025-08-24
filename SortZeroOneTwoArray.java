import java.util.Arrays;

public class SortZeroOneTwoArray {
    public static void Sorter(int[]arr, int n){
//        FAILED ATTEMPT 1:
//        int i = 1;
//        int low = arr[i-1];
//        int mid = arr[i];
//        int high = arr[i+1];
//        while(i<n-1){
//            if(low>mid){
//                int temp = low;
//                low = mid;
//                mid = temp;
//            } else if (mid>high) {
//                int temp2 = mid;
//                mid = high;
//                high =temp2;
//            }
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));

        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(arr[mid] == 1){
                mid++;
            } else if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] =temp;
                mid ++;
                low++;
            } else if (arr[mid] == 2) {
                int temp1 = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp1;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={2,1,1,2,2,2,0,0,0,2,1};
        int n = arr.length;
        Sorter(arr, n);
        System.out.println("Program Executed")
    }
}

