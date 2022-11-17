public class Solution{
    //I will implement a binary search alg first
    static int[] nums ;
    static int target ;   ;




public static int iterativeFun(int start, int end){
    
    int mIndex = (end - start)/2 + start ; 
    System.out.println(start + " " + end + " " + mIndex) ; 
    
    if (nums[mIndex] == target) return mIndex ; 
    
    

    if(mIndex == start){
        if(target < nums[mIndex]) return start ; 
        if(target > nums[end]) return end + 1 ; 
        else return end ; 
    }

    if(target < nums[mIndex]) return iterativeFun(start, mIndex -1 ) ; 
    else return iterativeFun(mIndex+1, end) ; 
}

public int searchInsert(int[] nums, int target){
    Solution.nums = nums ; 
    Solution.target = target ; 
    return iterativeFun(0, nums.length - 1)  ; 
}
    public static void main(String[] args) {
        int[] nums = {3,5,7,9,10} ; 
        var solution = new Solution() ; 
        int result = solution.searchInsert(nums, 8 ) ; 
        System.out.println(result);
    }
}



