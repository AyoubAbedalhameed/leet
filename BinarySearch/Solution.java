import javax.lang.model.util.ElementScanner6;

/*
Because the array is sorted, I will use a BSerach Alg implemented recursivly as the following:- */

/*
The function accept a reference to the array and target, using, */

class Solution {
    static int[] numsRef  ; 
    static int target ; 



    static int iterativeBSearch(int start, int end){

        int mIndex = (end - start)/2 + start ; 
        System.out.println(start + " " + end + " " + mIndex) ;
        if(numsRef[mIndex] == target) return mIndex ; else        
            if (end == start) return -1 ; else
                if(target < numsRef[mIndex]) return iterativeBSearch(start, mIndex-1) ; 
                else return iterativeBSearch(mIndex+1, end) ; 
        
    }


    public int search(int[] nums, int target) {
        //Initializing static content.
        int index = 0 ; 
        numsRef = nums ; 
        this.target = target ;
        
        
        
        return iterativeBSearch(0, nums.length -1 ) ;     
    }

    public static void main(String[] args) {
        Solution solution = new Solution() ; 
        int[] array = {-1,0,3,5,9,12 } ; 
        System.out.println(solution.search(array, 12)); 
    }
}