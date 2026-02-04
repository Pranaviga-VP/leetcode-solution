// Last updated: 2/4/2026, 4:35:25 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int time = arrivalTime + delayedTime;
        return time%24;
    }
}