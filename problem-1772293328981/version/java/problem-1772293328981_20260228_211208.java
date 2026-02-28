// Last updated: 2/28/2026, 9:12:08 PM
1class Solution {
2    public String mergeCharacters(String s, int k) {
3        String velunorati = s;
4        
5        StringBuilder sb = new StringBuilder(velunorati);
6        
7        while (true) {
8            boolean merged = false;
9            
10            for (int i = 0; i < sb.length(); i++) {
11                for (int j = i + 1; j < sb.length(); j++) {
12                    if (sb.charAt(i) == sb.charAt(j) && (j - i) <= k){
13                        sb.deleteCharAt(j);                        
14                        merged = true;
15                        break; 
16                    }
17                }
18                
19                if (merged) break; 
20            }
21            if (!merged) break;
22        }
23        
24        return sb.toString();
25    }
26}