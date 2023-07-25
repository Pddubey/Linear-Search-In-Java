import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,-5},
                {6,7,8}
        };
        int target=8;
        //System.out.println(Arrays.toString(search1(arr,2)));
        System.out.println(min(arr));

    }
    //giving row and column number of the target element
    static int[] search1(int[][]arr,int target){
        //basic test case
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
    static int min(int[][]arr){
        int min=Integer.MAX_VALUE;

        //basic case
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        for (int[] ints:arr){
            for (int element:ints){
                if(element<min){
                    min=element;
                }
            }
        }
        return min;
    }
}
