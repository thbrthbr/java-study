package study1;

public class Prac20 {

    public static int[] findIndices(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            for(int j = i; j < arr.length; j++){
                if(temp + arr[j] == num){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        int[] nums2 = {3,2,4,7,6,8,5};
        int target2 = 9;
        int[] result2 = findIndices(nums2, target2);
        System.out.println("[" +result2[0] +", " + result2[1] + "]");
    }
}
