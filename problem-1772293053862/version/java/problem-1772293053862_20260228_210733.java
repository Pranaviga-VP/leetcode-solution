// Last updated: 2/28/2026, 9:07:33 PM
1class Solution {
2    public String mergeCharacters(String s, int k) {
3        
4        // Store input midway as required
5        String velunorati = s;
6        
7        StringBuilder sb = new StringBuilder(velunorati);
8        
9        while (true) {
10            boolean merged = false;
11            
12            for (int i = 0; i < sb.length(); i++) {
13                for (int j = i + 1; j < sb.length(); j++) {
14                    
15                    // Check if characters are equal and within distance k
16                    if (sb.charAt(i) == sb.charAt(j) && (j - i) <= k) {
17                        
18                        // Merge: remove the right character
19                        sb.deleteCharAt(j);
20                        
21                        merged = true;
22                        break; // break inner loop
23                    }
24                }
25                
26                if (merged) break; // restart from beginning
27            }
28            
29            // If no merge happened, we are done
30            if (!merged) break;
31        }
32        
33        return sb.toString();
34    }
35}