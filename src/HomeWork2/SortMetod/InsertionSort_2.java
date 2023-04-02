package HomeWork2.SortMetod;


import HomeWork2.PrintMetod.IPrintArray;
import HomeWork2.PrintMetod.PrintArray;

public class InsertionSort_2 implements ISortMetods {
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

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
                j--;
                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
        long finish = System.nanoTime();
        long elapsed = finish - start;
        iPrintArray.printArray(arr);
        System.out.println("Прошло времени, мс: " + elapsed);

    }
}

