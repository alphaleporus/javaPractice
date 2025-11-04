package PracticalPractice;

public class MinMaxDivideConquer {
    static class Pair{
        int min;
        int max;
    }

    static Pair MinMaxFinder(int[]arr, int low, int high){
        Pair result = new Pair();
        Pair left = new Pair();
        Pair right = new Pair();

        if(low==high){
            result.min = arr[low];
            result.max = arr[low];
            return result;
        }

        if(high == low+1){
            if(arr[low]<arr[high]){
                result.max = arr[high];
                result.min= arr[ low];
            } else if (arr[low]>arr[high]) {
                result.max = arr[low];
                result.min = arr[high];
            }
            return result;
        }

        int mid = (low+high)/2;
        left = MinMaxFinder(arr, low, mid);
        right = MinMaxFinder(arr,mid+1, high);

        result.min = Math.min(left.min, right.min);
        result.max = Math.max(left.max, right.max);

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {2,1,3,42,5,6,8,32,7};

        Pair result = MinMaxFinder(arr, 0, arr.length-1);
        System.out.println("Min: " + result.min);
        System.out.println("Max: " + result.max);

    }
}
