QUESTION: https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long ans = Integer.MAX_VALUE;

        Collections.sort(a);
        
        
        
        for(int i=0;i<=n-m;i++){
            int minv=a.get(i);
            int maxv=a.get(i+m-1);
            
            int diff=maxv-minv;
            
            if(diff< ans){
                ans=diff;
            }
            
        }
        return ans;
    }
}
