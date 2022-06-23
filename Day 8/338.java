class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        int i,j,ones;
        for(i=0;i<=n;i++)
        {
            ones=0;
            j=i;
            while(j>0)
            {
                if(j%2==1)
                    ones++;
                j=j/2;
            }
            ans[i]=ones;
        }
        return ans;
    }
}