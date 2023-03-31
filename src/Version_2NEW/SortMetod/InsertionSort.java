package Version_2NEW.SortMetod;

import Version_2NEW.PrintMetod.IPrintArray;
import Version_2NEW.PrintMetod.PrintArray;

public class InsertionSort implements ISortMetods {

    /**
     * Сортировка вставкой O(n**2) insertion sort
     * сортирует с первого элемента п перемещает в нужной последовательности!
     *
     * @param arr (на вход принимает массив)
     */
    @Override
    public void sortMetodAlgoritms(int[] arr) {
        IPrintArray iPrintArray = new PrintArray();
        long start = System.nanoTime();
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
        long finish = System.nanoTime();
        long elapsed = finish - start;
        iPrintArray.printArray(arr);
        System.out.println("Прошло времени, мс: " + elapsed);
    }


}
