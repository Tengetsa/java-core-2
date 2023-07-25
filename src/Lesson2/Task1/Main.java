package Lesson2.Task1;

import java.util.Arrays;

/**
 * Задача: Написать функцию добавления элемента в конец массива
 * таким образом, чтобы она расширяла массив при необходимости
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int num = 7;
        int index = 4;

        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(AddLast(arr, num)));
//        System.out.println(Arrays.toString(addIndex(arr, num, 2)));

        System.out.println(Arrays.toString(insertIntoArray(arr, num, index)));
    }

    public static int[] AddLast(int[] arr, int num) {

        int[] tmpArr = new int[arr.length + 1];

//        for (int i = 0; i < arr.length; i++) {
//            tmpArr[i] = arr[i];
        System.arraycopy(arr, 0, tmpArr, 0, arr.length); // алтернатива for
        tmpArr[arr.length] = num;
        return tmpArr;
    }

    public static int[] addIndex(int[] arr, int num, int index) {

        if (!(index >= 0 && index <= arr.length)) {
            System.out.println("Индекс за пределами исходного массива");
            return null;

        } else if (index == arr.length) {
            return AddLast(arr, num);
        } else {
            int[] tmpArr = new int[arr.length + 1];
            int tmp = 0;

            for (int i = 0; i < arr.length + 1; i++) {
                if (i == index) {
                    tmpArr[i] = num;
                    tmp++;
                } else {
                    tmpArr[i] = arr[i - tmp];
                }
            }
            return tmpArr;
        }

    }

    public static int[] insertIntoArray(int[] arr, int value, int index) {
        if ((index < 0 || index > arr.length)) {
            throw new IllegalArgumentException("Индекс вышел за рамки массива");

        }
        int[] result = new int[arr.length + 1];

        System.arraycopy(arr, 0, result, 0, index); // копируем первую половину массива arr(до index)

        result[index] = value; // добавляем значения на определёный индекс

        System.arraycopy(arr, index, result, index + 1, arr.length - index); // копируем вторую половину массива arr после указаного индекса

        return result;
    }

    public static int[] insertIntoArray(int[] arr, int value) {
        return insertIntoArray(arr, value, arr.length);
    }
}

