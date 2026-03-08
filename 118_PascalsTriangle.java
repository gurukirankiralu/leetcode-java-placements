// 118 - Pascal's Triangle
// Time Complexity: O(n²)
// Space Complexity: O(n²)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> result=new ArrayList<>();
        for(int i=0;i<numRows;i++){
             List<Integer>row=new ArrayList<>();
             List<Integer>prev=null;
             if(i>0){
             prev=result.get(i-1);
             }
            for(int j=0;j<i+1;j++ ){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    int res=prev.get(j-1)+prev.get(j);
                    row.add(res);
                }
            }
            result.add(row);  
        }
        return result;
    }
}
