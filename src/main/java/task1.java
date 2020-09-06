public class task1 {

    public static void main(String[] args) {
        //сортировка пузырьком
        int[] nums = new int[] { 9, 8, 8, 7, 5, 3, 1, 0};
        int n=nums.length;
        while (n>1){
            n=srt(nums, n);
        }
        print_arr(nums);
    }
    public static int srt(int[] arr, int j){
        int t;
        for (int i=0; i<(j-1); i++){
            if (arr[i]>arr[i+1]) {
                t=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=t;
            }
        }
        return j-1;
    }

    public static void print_arr(int[] arr){
        for (int i=0; i<arr.length; i++) {
            System.out.print(""+arr[i]+" ");
        }
    }
}
