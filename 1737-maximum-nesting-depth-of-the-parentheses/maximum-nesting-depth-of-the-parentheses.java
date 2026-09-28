class Solution {
    public int maxDepth(String s) {
        int count=0;
        int res=Integer.MIN_VALUE;
        for(char ch:s.toCharArray()){
            if(ch=='(') {
                count++;
                res=Math.max(res,count);
            }else if(ch==')'){
                count--;
            }
        }
        if(res==Integer.MIN_VALUE) return 0;
        return res;
        
    }
}