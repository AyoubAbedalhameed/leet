class Solution {
    public int[] runningSum(int[] nums) {
        int[] solution = new int[nums.length] ; 
        solution[0] = nums[0] ; 
        for (int i = 1 ; i < nums.length ; i++)
            solution[i] = solution[i-1] + nums[i]   ; 

        return solution ; 

        
    }
}