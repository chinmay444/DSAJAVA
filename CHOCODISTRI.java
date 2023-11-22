class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        
        long ans=0;
        
        for(int i=0;i<=n-m;i++){
            int minv=a.get(0);
            int maxv=a.get(i+m-1);
            
            int diff=maxv-minv;
            
            if(diff< ans){
                ans=diff;
            }
            
        }
        return ans;
    }
}
