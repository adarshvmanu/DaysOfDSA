class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i,count=0,a=0,b=n;
        int[] ans=new int[2*n];
        for(i=0;i<nums.length;i++){
            if(i%2!=0)
              ans[count]=nums[b++];
            else
              ans[count]=nums[a++];
            count++;
        }
        return ans;
    }
}