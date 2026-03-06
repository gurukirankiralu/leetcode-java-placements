// 54 - Spiral Matrix
// Time Complexity: O(m × n)
// Space Complexity: O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int left=0;
        int right=c-1;
        int top=0;
        int butom=r-1;
        List<Integer> list=new ArrayList<>();
        while(left<=right&&top<=butom){
           for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
           }
                top++;
           for(int i=top;i<=butom;i++){
            list.add(matrix[i][right]);
           }
                right--;
        if(top<=butom){
           for(int i=right;i>=left;i--){
            list.add(matrix[butom][i]);
           }
        }
                butom--;
            if(left<=right){
           for(int i=butom;i>=top;i--){
            list.add(matrix[i][left]);
           }
         }
            left++;

        }
        return list;
    }
}
