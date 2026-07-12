class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[]ans=new int[2];
      int i,j;
      for(i=0;i<=nums.length-1;i++){
        for(j=i+1;j<=nums.length-1;j++){
            if(nums[i]+nums[j]==target){
                ans[0]=i;
                ans[1]=j;
            }
        }
      }
      return ans;  
    }
}