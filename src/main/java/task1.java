public class task1 {

    public static void main(String[] args) {
        //сортировка пузырьком
        int[] nums = new int[] { 9, 8, 8, 7, 5, 3, 1, 0};
        int n=nums.length;
        while (n>1){
            n=srt(nums, n);
        }
        print_arr(nums);
        System.out.println();

        //иерархия объектов Circle, Rect, Triangle, Square
        Figure[] f = new Figure[4];
        f[0] = new Circle(5);
        f[1] = new Rect(2,3);
        f[2] = new Square(5);
        f[3] = new Triangle(3, 4, 5);
        for (int i=0; i<4; i++){
            System.out.println("Периметр "+f[i].perimeter()+", площадь "+f[i].area());
        }
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
