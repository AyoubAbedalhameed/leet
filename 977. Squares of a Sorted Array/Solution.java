class Solution {
    public static int[] sortedSquares(int[] nums)
    {
        int[] solved = new int[nums.length] ; 
        int r = nums.length - 1 ; 
        int l = 0  ; 

        for(int i = nums.length - 1 ; r >= l  ; i -- ){
            if(java.lang.Math.abs(nums[r]) >= java.lang.Math.abs(nums[l])) {
                solved[i]= nums[r] * nums[r] ; 
                r-- ; 
                continue ; 
            }

            solved[i] = nums[l] * nums[l] ; 
            l ++ ; 
        }

        return solved ; 
    }


}
