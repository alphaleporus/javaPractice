public class leetcode48 {
    public void rotate(int[][] matrix) {
        int rows = matrix.length-1;
        int columns = matrix[0].length-1;

        for(int i = 0;i<=rows-1;i++){
            for(int j=columns; j>i;j--){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i =0;i<=rows;i++){
            int start = 0;
            int end=columns;
            while(start<end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}
