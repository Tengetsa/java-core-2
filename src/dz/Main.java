package dz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        int[] arr = {1, 3, 2, 6, 9, 10, 1, 10, 2, 5, 4, 9, 6, 10};
        int maxValue = 10;
        int[] sortedArray = SortingByCounting.countingSort(arr, maxValue);

        System.out.println("Исходный массив:" + Arrays.toString(arr));
        System.out.println("Отсортированный:" + Arrays.toString(sortedArray));
    }

    private static void task2() {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.print("Введите строку для шифрования(англ. буквами: ");
        message = sc.next();

        System.out.println("\n\nВведите шифрованлный ключ:");
        int encryptedKey = sc.nextInt();

        System.out.println("\nЗашифрованное сообщение: " + CaesarCipher.encrypt(message, encryptedKey));
        System.out.println("\n\nВведите шифрованлный ключ:");
//        int decryptionKey = encryptedKey * -1;
        int decryptionKey = sc.nextInt();
        System.out.println("\nРасшифрованое сообщение: " + CaesarCipher.decipher(message, decryptionKey));
    }


    private static void task3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int position = 3;
        System.out.println(Arrays.toString(ArrayShift.array(array, position)));
    }
}
