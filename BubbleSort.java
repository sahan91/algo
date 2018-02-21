public class BubbleSort{

    static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();        
    }

    static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

     public static void main(String []args){
        int[] arr = {10, 5, 3, 4, 1};
        int end = arr.length - 1;

        while (0 <= end) {
            for (int i=0; i<end; i++) {
                if (arr[i] > arr [i + 1]) {
                    swap(arr, i);
                }
            }
            end--;
        }
        display(arr);
     }
}
