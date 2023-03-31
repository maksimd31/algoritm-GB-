package Version_2NEW.SortMetod;

import Version_2NEW.PrintMetod.IPrintArray;
import Version_2NEW.PrintMetod.PrintArray;

public class QuickSort implements ISortMetods {
    @Override
    public void sortMetodAlgoritms(int[] arr) {
        IPrintArray iPrintArray = new PrintArray();
        long start = System.nanoTime();

        quickSort(arr, 0, arr.length - 1);

        long finish = System.nanoTime();
        long elapsed = finish - start;
        iPrintArray.printArray(arr);
        System.out.println("Прошло времени, мс: " + elapsed);

    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int pi = wait(arr, l, r);

        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, r);

    }

    private static int wait(int[] arr, int l, int r) {
        int pivot = arr[r];
        int ptr = l - 1;
        for (int i = l; i < r; i++) {
            if (arr[i] < pivot) {
                ptr++;
                swap(ptr, i, arr);
            }

        }
        swap(ptr + 1, r, arr);
        return ptr + 1;
    }

    private static void swap(int ptr, int i, int[] arr) {
        int temp = arr[ptr];
        arr[ptr] = arr[i];
        arr[i] = temp;
    }
}
