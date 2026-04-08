// 191 - Number of 1 Bits
// Time Complexity: O(1)
// Space Complexity: O(1)
class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}
