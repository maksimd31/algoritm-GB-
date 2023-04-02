package HomeWork2.SortMetod;

import HomeWork2.PrintMetod.IPrintArray;
import HomeWork2.PrintMetod.PrintArray;

public class BubbleSort implements ISortMetods {
    IPrintArray iPrintArray = new PrintArray();
    /**
     * Пузырьковая сортировка! сложность O(n**2)
     *
     * @param arr (на вход принимает массив)
     */
    @Override
    public void sortMetodAlgoritms(int[] arr) {
        long start = System.nanoTime();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int k = 1; k < n - i; k++) {
                if (arr[k] < arr[k - 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                }
            }

        }
        long finish = System.nanoTime();
        long elapsed = finish - start;
        iPrintArray.printArray(arr);
        System.out.println("Прошло времени, мс: " + elapsed);

    }
}
