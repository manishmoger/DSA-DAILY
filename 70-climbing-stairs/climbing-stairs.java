class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        return fun(0,n);


        
    }
    int fun(int i,int n){
        if(i==n) return 1;
        if(i>n) return 0;
         if (map.containsKey(i))
            return map.get(i);

        int ans1=fun(i+1,n);
        int ans2=fun(i+2,n);

        int total=ans1+ans2;
       map.put(i, total);
        return total;

    }
}