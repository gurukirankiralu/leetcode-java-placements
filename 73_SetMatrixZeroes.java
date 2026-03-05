// 73 - Set Matrix Zeroes
// Time Complexity: O(m × n)
// Space Complexity: O(1)
class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLen=matrix.length;
        int colLen=matrix[0].length;
        List<Integer>row=new ArrayList<>();
        List<Integer>col=new ArrayList<>();
        for(int i=0;i<rowLen;i++){
            for(int j=0;j<colLen;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int r:row){
            for(int j=0;j<colLen;j++){
                matrix[r][j]=0;
            }
        }

            for(int i=0;i<rowLen;i++){
                for(int c:col){
                matrix[i][c]=0;
            }
      }

    }
}
