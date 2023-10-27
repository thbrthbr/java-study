package study1;

public class Prac19 {
    public static int sumLessThan(int[] arr, int num) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(num > arr[i]) {
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        int[] nums1 = {2, 5, 8, 3, 7};
        System.out.println(sumLessThan(nums1, 5));
    }
}
