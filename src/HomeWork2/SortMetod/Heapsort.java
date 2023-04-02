package HomeWork2.SortMetod;

import HomeWork2.PrintMetod.IPrintArray;
import HomeWork2.PrintMetod.PrintArray;

public class Heapsort implements ISortMetods {
    /**
     * Сортировка кучей
     * @param arr (на вход принимает массив)
     */
    @Override
    public void sortMetodAlgoritms(int[] arr) {
        long start = System.nanoTime();
        IPrintArray iPrintArray = new PrintArray();
        heapSort(arr);

        long finish = System.nanoTime();
        long elapsed = finish - start;
        iPrintArray.printArray(arr);
        System.out.println("Прошло времени, мс: " + elapsed);
    }




    public static void heapSort(int[] arr){
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, i, n);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }


    private static void heapify(int[] arr, int i, int n) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int larest = i;

        if (l < n && arr[l] > arr[larest])
            larest = l;
        if (r < n && arr[r] > arr[larest])
            larest = r;
        if (i != larest) {
            int temp = arr[i];
            arr[i] = arr[larest];
            arr[larest] = temp;

            heapify(arr, larest, n);
        }
    }

}
