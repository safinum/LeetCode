class Solution {
    public int countLargestGroup(int n) {
        if (n < 10) return n;
        
        ArrayList<Integer> groups = new ArrayList<>();
        int val = 1; 
        
        for (int i = 1; i <= n; i++) {
            int a = sumOfDigits(i);
            if (groups.contains(a) == false) {
                groups.add(a);
            }
        } 
        
        int[] vals = new int[groups.size()];
        Collections.sort(groups); 
        
        for (int i = 1; i <= n; i++) {
            int a = sumOfDigits(i)-1;
            vals[a] += 1;
        }

        Arrays.sort(vals);
        for (int i = 1; i < vals.length; i++) {
            if (vals[i] > vals[i-1]) {
                val = 1;
            }
            else val++;
        }
        return val;
    }
    
    public int sumOfDigits (int n) {
        int sum = 0;
        while (n > 0) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}