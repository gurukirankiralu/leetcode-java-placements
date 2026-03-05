// 48 - Rotate Image
// Time Complexity: O(n^2)
// Space Complexity: O(1)
class Solution {
    public void rotateMatrix(int[][] matrix) {
        int rowLen=matrix.length;
        int colLen=matrix[0].length;
        for(int i=0;i<rowLen;i++){
            for(int j=i+1;j<colLen;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
         for(int i=0;i<rowLen;i++){
            int left=0;
            int right=colLen-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
         }
        
    }
}
