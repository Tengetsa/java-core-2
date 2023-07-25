package dz;

public class ArrayShift {
    public static int[] array(int[] arr, int n) {
//        int lastPosition = arr[arr.length - 1];

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int position = arr[arr.length - 1];

                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }

                arr[0] = position;

            }
        } else {
            for (int i = 0; i > n; i--) {
                int position = arr[0];

                for (int j = 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }

                arr[arr.length - 1] = position;
            }
        }
//        arr[0] = lastPosition;

        return arr;
    }
}
