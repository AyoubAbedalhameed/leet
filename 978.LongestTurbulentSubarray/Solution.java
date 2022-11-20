public class Solution{



    

    public static int maxTurbulenceSize(int[] arr) {
        int currentLength = 0 ; 
        int maxLength = 0 ; 

        boolean mustBeSmaller = true  ; 
        int end = arr.length - 1 ; 
         

        for(int i = 0 ; i < end ; i++){
                if(arr[i] == arr[i+1]){
                if(currentLength > maxLength) maxLength = currentLength ; currentLength = 0 ; continue ; 
            }

            if(arr[i] < arr[i+1]){
                if(mustBeSmaller) {currentLength++ ; mustBeSmaller = !mustBeSmaller ; continue ;} 
                else {if(currentLength > maxLength) maxLength = currentLength ; currentLength = 1 ; continue ;}
            }

            if(arr[i] > arr[i+1]){
                if(! mustBeSmaller) {currentLength++ ; mustBeSmaller = !mustBeSmaller ; continue ;} 
                else {if(currentLength > maxLength) maxLength = currentLength ; currentLength = 1 ; continue ;}     
            }

        }

        if(currentLength > maxLength) maxLength = currentLength ; 
        return maxLength + 1 ; 
    }




    public static void main(String[] args) {
        int[] arr = {4} ; 
        System.out.println(Solution.maxTurbulenceSize(arr));
        
    }

}