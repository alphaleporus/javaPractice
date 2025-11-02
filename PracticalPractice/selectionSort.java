package PracticalPractice;

public class selectionSort {
    static int minIndexFinder(int[]input, int start, int end){
        int minIndex = start;
        for(int i = start + 1; i<=end; i++){
            if(input[i]<input[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }

    static void selectionSorter(int[]unsorted, int start, int end){
        if(start >= end)
            return;

        int minIndex = minIndexFinder(unsorted,start,end);

        int temp = unsorted[start];
        unsorted[start]=unsorted[minIndex];
        unsorted[minIndex] = temp;

        selectionSorter(unsorted, start+1, end);
    }

    public static void main(String[] args) {
        int[] unsorted ={50,60,20,30,10,40};
        System.out.println("Unsorted Array: ");
        for(int i = 0; i< unsorted.length;i++){
            System.out.print(unsorted[i]+", ");
        }
        System.out.println();
        System.out.println();

        selectionSorter(unsorted, 0, unsorted.length-1);

        System.out.println("Sorted Array: ");
        for(int i = 0; i< unsorted.length;i++){
            System.out.print(unsorted[i]+", ");
        }
        System.out.println();
    }
}
