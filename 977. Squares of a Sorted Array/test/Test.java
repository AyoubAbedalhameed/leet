public class Test{

    static int[] solvedNums ; 

    

    
    public void doFunction(int startReadFrom, int mode, int classNumsIndex, int[] classNums, int[] solvedNums ){
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

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 7, 9} ; 
        int[] solvedNums ;
        solvedNums = new int[nums.length] ; 

        Test.solvedNums = solvedNums ; 


        
        Test test = new Test() ; 
        
        test.doFunction(0, 1, 0, nums, solvedNums) ;
        for(int i = 0 ; i < nums.length ; i++) 
        System.out.print(Test.solvedNums[i] + ", ");
        
    }
}