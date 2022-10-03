class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int maxIncrease = 0;
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        
        for (int i = 0; i < grid.length; i++) {
            int biggestI = 0;
            int biggestJ = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > biggestI) {
                    biggestI = grid[i][j];
                }
            }
            
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > biggestJ) {
                    biggestJ = grid[j][i];
                }
            }
            rows.add(biggestI);
            cols.add(biggestJ);
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (rows.get(i) < cols.get(j)) {
                    int a = rows.get(i) - grid[i][j];
                    maxIncrease += a;
                }
                else {
                    int a = cols.get(j) - grid[i][j];
                    maxIncrease += a;
                }
            }
        }
        return maxIncrease;
    }
}