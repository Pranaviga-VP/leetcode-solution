// Last updated: 2/14/2026, 8:55:40 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weight) {
3    StringBuilder result = new StringBuilder();
4        for(String word : words){
5            int sum = 0;
6            for(char ch : word.toCharArray()){
7                sum += weight[ch - 'a'];
8            }
9            int remainder = sum%26;
10            char mappedChar = (char)('z' - remainder);
11            result.append(mappedChar);
12        }
13        return result.toString();
14        
15    }
16}