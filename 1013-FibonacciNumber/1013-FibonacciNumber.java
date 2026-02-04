// Last updated: 2/4/2026, 4:36:51 PM
class Solution {
    public int fib(int n) {
       if(n<=1) return n;
       int a=0,b=1;
       for(int i=2;i<=n;i++){
        int temp = b;
        b=a+b;
        a=temp;
       } 
       return b;
    }
}