class Solution {
    public int findLucky(int[] arr) {
        int count = 0;
        
        Arrays.sort(arr);
        ArrayList<Integer> n = new ArrayList<>();
        
        if (arr[0] == 1 && arr[1] != 1) n.add(1);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else { 
                count = 0;
            }
            if (count+1 > arr[i-1]) {
                if (n.contains(arr[i-1])) n.remove(Integer.valueOf(arr[i-1]));
            }
            else if (count+1 == arr[i-1] && arr[i] == arr[i-1]) {
                n.add(arr[i-1]);
            }
        }
        
        
        if (n.isEmpty()) return -1;
        else return n.get(n.size() - 1);
    }
}