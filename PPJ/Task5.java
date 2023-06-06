public class Task5 {
    public static void main(String[] args){
        int[] arr = {2, 5, 3, 2, 1, 3, 6, 5, 3};

        for (int i = 0; i < arr.length; i++) {
            boolean uniq = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j] && j<i) {
                    uniq = false;
                    break;
                }
            }
            if (uniq) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
