class Solution {
    public int numTrees(int n) {
        if (n <= 2) return n; 
        
        double num = 1;
        int a = 2 * n; 
        
        for (int i = 0; i < n; i++) { 
            num = num * (a - i);
            num = num / (i + 1);
        }
        
        return (int)(num/(n+1)); 
    }
}