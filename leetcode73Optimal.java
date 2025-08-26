public class leetcode73Optimal {
    public static void setZeroes(int[][] matrix) {
        boolean zeroColumn = false;
        boolean zeroRow = false;

        for(int j=0;j< matrix[0].length;j++){
            if(matrix[0][j]==0){
                zeroRow=true;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                zeroColumn = true;
                break;
            }
        }
        //Marking zeros
        for(int i=1;i<matrix.length;i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //Based on zero markers
        for(int i= matrix.length-1; i>0;i--){
            for(int j = matrix[i].length-1;j>0;j--){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(zeroColumn){
            for(int i = 0;i< matrix.length;i++) {
                matrix[i][0] = 0;
            }
        }
        if(zeroRow){
            for(int j =0;j< matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
    }

    public static void PrintMatrix(int[][]matrix){
        for(int i =0;i< matrix.length;i++){
            for(int j =0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        PrintMatrix(matrix);
    }
}
