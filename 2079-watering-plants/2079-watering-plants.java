class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        if (plants[0] > capacity) {
            return 0;
        }
        
        int steps = 0;
        int water = capacity;
        
        for (int i = 0; i < plants.length; i++) {
            if (plants[i] <= water) {
                steps++; 
                water = water - plants[i]; 
            }
            else {
                steps += i*2 + 1;
                water = capacity - plants[i];
            }
        }
        return steps;
    }
}