public class linearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int num = 3;
        boolean isPresent = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                System.out.println(i);
                isPresent =true;
                break;
            }
        }
        if(!isPresent){
            System.out.println("-1");
        }
    }
}
