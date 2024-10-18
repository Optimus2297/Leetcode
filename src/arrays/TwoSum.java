package arrays;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        //Complexity o(n^2)
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }

        //Complexity o(n)
        Map<Integer, Integer> res = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(res.containsKey(target - nums[i])){
                return new int[] {i,res.get(target - nums[i])};
            }
            res.put(nums[i],i);
        }
            return new int[] {};
        }
}
