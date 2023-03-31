package Version_2NEW.SortMetod;

import Version_2NEW.PrintMetod.IPrintArray;
import Version_2NEW.PrintMetod.PrintArray;

public class SelectionSort implements ISortMetods {
    /**
     * сортировка выбором
     * @param arr
     */
    @Override
    public void sortMetodAlgoritms(int[] arr) {
        IPrintArray iPrintArray = new PrintArray();
        long start = System.nanoTime();
        selectionSort(arr);

        long finish = System.nanoTime();
        long elapsed = finish - start;
        iPrintArray.printArray(arr);
        System.out.println("Прошло времени, мс: " + elapsed);


    }
    private void selectionSort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j])
                    min_index = j;

            }
            swap(i, min_index, arr);
        }


    }

    private static void swap(int i, int min_index, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }
}
