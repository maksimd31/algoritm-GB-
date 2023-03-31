package Version_2NEW.SortMetod;

import Version_2NEW.PrintMetod.IPrintArray;
import Version_2NEW.PrintMetod.PrintArray;

public class MergeSort implements ISortMetods{
    @Override
    public void sortMetodAlgoritms(int[] arr) {
        IPrintArray iPrintArray = new PrintArray();
        long start = System.nanoTime();
        mergeSort(arr);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        iPrintArray.printArray(arr);
        System.out.println("Прошло времени, мс: " + elapsed);
    }

    private void mergeSort(int[] arr){
        int n = arr.length;

        if (n == 1) return;

        int mid = n / 2;
        int[] L = new int[mid];
        int[] R = new int[n - mid];

        for (int i = 0; i < mid; i++)
            L[i] = arr[i];
        for (int i = mid; i < n; i++)
            R[i - mid] = arr[i];

        mergeSort(L); // рекурсия
        mergeSort(R); //рекурсия
        merge(arr, L, R);
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int Left = l.length;
        int Right = r.length;

        int i = 0; // отвечает за левую сторону
        int j = 0; // отвечает за правую сторону
        int idx = 0;

        while (i < Left && j < Right) {
            if (l[i] < r[j]) {
                arr[idx] = l[i];
                i++;
                idx++;

            } else {
                arr[idx] = r[j];
                j++;
                idx++;
            }


        }
        for (int ll = i; ll < Left; ll++)
            arr[idx++] = l[ll];

        for (int rr = j; rr < Right; rr++)
            arr[idx++] = r[rr];

    }
}
