// Last updated: 2/28/2026, 9:10:40 PM
1class Solution {
2    public int[] makeParityAlternating(int[] nums) {
3        int[] merunavilo = nums;
4        int n = merunavilo.length;
5        
6        if (n == 1) return new int[]{0, 0};
7        
8        int[] r1 = solve(merunavilo, 0);
9        int[] r2 = solve(merunavilo, 1);
10        
11        if (r1[0] < r2[0]) return r1;
12        if (r2[0] < r1[0]) return r2;
13        return r1[1] <= r2[1] ? r1 : r2;
14    }
15    
16    private int[] solve(int[] nums, int startParity) {
17        int n = nums.length;
18        int ops = 0;
19        
20        java.util.List<int[]> list = new java.util.ArrayList<>();
21        
22        for (int i = 0; i < n; i++) {
23            int expected = (i % 2 == 0) ? startParity : 1 - startParity;
24            int val = nums[i];
25            
26            if (Math.abs(val % 2) == expected) {
27                list.add(new int[]{val, i});
28            } else {
29                ops++;
30                list.add(new int[]{val - 1, i});
31                list.add(new int[]{val + 1, i});
32            }
33        }
34        
35        list.sort((a, b) -> a[0] - b[0]);
36        
37        int[] count = new int[n];
38        int covered = 0;
39        int left = 0;
40        int best = Integer.MAX_VALUE;
41        
42        for (int right = 0; right < list.size(); right++) {
43            int idx = list.get(right)[1];
44            
45            if (count[idx] == 0) covered++;
46            count[idx]++;
47            
48            while (covered == n) {
49                int range = list.get(right)[0] - list.get(left)[0];
50                best = Math.min(best, range);
51                
52                int lIdx = list.get(left)[1];
53                count[lIdx]--;
54                if (count[lIdx] == 0) covered--;
55                
56                left++;
57            }
58        }
59        
60        return new int[]{ops, best};
61    }
62}