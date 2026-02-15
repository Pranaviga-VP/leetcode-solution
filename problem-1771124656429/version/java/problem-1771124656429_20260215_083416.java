// Last updated: 2/15/2026, 8:34:16 AM
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3    Map<Integer,Integer>freq = new HashMap<>();
4    for(int b : bulbs){
5        freq.put(b,freq.getOrDefault(b,0)+1);
6    }
7        List<Integer> result = new ArrayList<>();
8        for(int b : freq.keySet()){
9            if(freq.get(b)%2 == 1){
10                result.add(b);
11            }
12        }
13        Collections.sort(result);
14        return result;
15    }
16}