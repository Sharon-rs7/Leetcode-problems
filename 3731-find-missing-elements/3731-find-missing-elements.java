class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums==null||nums.length==0){return res;}
        int min=nums[0];
        int max=nums[0];
        Set<Integer>seen=new HashSet<>();
        for(int num:nums){
            seen.add(num);
            if(num<min)min=num;
            if(num>max)max=num;
        }
        for(int i=min ; i<max; i++){
            if(!seen.contains(i))res.add(i);
        }

        return res;
    }
}