// Last updated: 2/4/2026, 4:34:56 PM
class Solution {
    public int residuePrefixes(String s) {
    HashSet<Character>set = new HashSet<>();
        int count = 0;
        for(int i = 0 ; i <s.length();i++){
            set.add(s.charAt(i));
            int prefixLength = i + 1 ;
            if(set.size() == prefixLength % 3 ){
                count++ ;
            }
        }
        return count ;
    }
}