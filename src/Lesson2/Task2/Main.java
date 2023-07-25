package Lesson2.Task2;

import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 9, 10, 1, 10, 2, 5, 4, 9, 6, 10};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(countSort(arr)));
    }

    public static int[] countSort(int[] arr) {

        int[] tmpArr = new int[arr.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();

//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            } else {
//                map.put(arr[i], 1);
//            }
//        }

//        for (int j : arr) {
//            if (map.containsKey(j)) {
//                map.put(j, map.getOrDefault(j, 0) + 1);
//            } else {
//                map.put(j, 1);
//            }
//        }

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        System.out.println("Map:" + map.toString());

        int index = 0;
        for (Integer key :
             map.keySet()) {
            for (int i = 0; i < map.get(key); i++) {
                tmpArr[index++] = key;
            }

        }
        return tmpArr;
    }
}
