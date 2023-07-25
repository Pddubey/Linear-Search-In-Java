//in this code snippet we are going to see how we perform
//linear search on array to find a given element in 1D array
public class SearchInArray {
    public static void main(String[] args) {
        int [] num={2,4,-1,43,76};
        //System.out.println(linearSearch(num,-1));
        //System.out.println(lineraSearch2(num,2));
        System.out.println(linearSearch3(num,-1));

    }
    //search the target and return the index if found:
    static int linearSearch(int[]arr,int target){
        //basic test
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    //search the element in array and if found return the element
    static int lineraSearch2(int[] arr,int element){
        //basic case test
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                return element;
            }
        }
        return Integer.MIN_VALUE;
    }
    static boolean linearSearch3(int []arr,int target){
        //basic case test
        if(arr.length==0){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return true;

    }
}
