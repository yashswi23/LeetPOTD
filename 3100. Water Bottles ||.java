class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalbott = numBottles;
        while(numBottles>= numExchange){
            numBottles-= numExchange;
            totalbott++;
            numBottles++;
            numExchange++;
        }

        return totalbott;
    }
}
