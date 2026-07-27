class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=0;
        for(int r=0;r<n;r++){
            if(nums[r]!=0){
                int temp=nums[left];
                nums[left]=nums[r];
                nums[r]=temp;
                left++;
            }
        }        
    }
}