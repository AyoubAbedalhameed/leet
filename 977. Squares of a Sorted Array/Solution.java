public class Solution{

    static boolean debug = true; 

    public static void doFunction(int startReadFrom, int mode, int classNumsIndex, int[] classNums, int[] solvedNums ){
        if(mode>0)
            for(int i = startReadFrom ; i<classNums.length ; i++){
                solvedNums[classNumsIndex] = classNums[i] * classNums[i] ; 
                classNumsIndex ++ ; 
                
            }
        else 
            for(int i = startReadFrom ; i>= 0 ; i--){
                System.out.println(i + " " + classNumsIndex + " " + classNums[i]) ; 
                solvedNums[classNumsIndex] = classNums[i] * classNums[i] ; 
                classNumsIndex ++ ; 
            }
        
    }






    public static int[] sortedSquares(int[] nums){
        int solvedArrayIndex = 0 ;
        int[] solvedArray ; 
        solvedArray = new int[nums.length] ; 
        
        //Finding the first non negative number, I will called it center 
        int center = -1 ; 
        for(int i = 0 ; i<nums.length ; i++)
        if(nums[i]>= 0) {center = i ; break ;}


        if(Solution.debug) System.out.println("center = " + center) ; 

        //Handling the cases where all the array are positives or negatives

            //Case 1: All the array elements are negative numbers:
            if(center == -1) {doFunction(nums.length -1 , -1, solvedArrayIndex, nums, solvedArray); return solvedArray ;}
            //Case 1: All the array elements are negative numbers:
            if(center == 0) {doFunction(0, 1, solvedArrayIndex, nums, solvedArray); return solvedArray ;} 



        //If the execution reachs this point then we have both negative and positive numbers. 
            int r = center ; int l = center - 1  ; 
            while(solvedArrayIndex < nums.length){
                if(debug) System.out.println( solvedArrayIndex + " " + r + " " + l);
                //Handling the case when we already have traversed all negative numbers.
                    if(l < 0){doFunction(r, 1, solvedArrayIndex, nums, solvedArray); return solvedArray ;}

                //Handling the case when we already have traversed all the positive numbers.
                    if(r == nums.length ){doFunction(l, -1, solvedArrayIndex, nums, solvedArray); return solvedArray ;}

                //Handling the case when we still have both positives and negatives, with to indecies
                    if(nums[r] <= nums[l] * -1){solvedArray[solvedArrayIndex] = nums[r] * nums[r] ; solvedArrayIndex++ ; r++ ;}
                    else {solvedArray[solvedArrayIndex] = nums[l] * nums[l] ; solvedArrayIndex++ ; l-- ;}
            }


            return solvedArray ; 
    }










}