package HomeWork2;

import HomeWork2.PrintMetod.IPrintArray;
import HomeWork2.PrintMetod.PrintArray;
import HomeWork2.SortMetod.*;


public class Main {
    public static void main(String[] args) {
        IPrintArray iPrintArray = new PrintArray();
        //массив для сортировки!
        int[] arr = {9, 8, 7, 4, 3, 6, 8, 3, 2, 1, 5, 834, 44, 2345, 34234, 33, 444, 56, 32, 23, 22, 1, 0};

        //Сортировка пузырьком!
        System.out.println("Сортировка пузырьком:");
        ISortMetods bubbleSort = new BubbleSort();
        bubbleSort.sortMetodAlgoritms(arr);
        System.out.println("==================================================================");

        //Сортировка кучей
        System.out.println("Сортировка кучей:");
        ISortMetods heapsort = new Heapsort();
        heapsort.sortMetodAlgoritms(arr);
//        iPrintArray.printArray(arr);
        System.out.println("==================================================================");

        //Сортировка вставкой
        System.out.println("Сортировка вставкой:");
        ISortMetods insertionSort = new InsertionSort();
        insertionSort.sortMetodAlgoritms(arr);
//        iPrintArray.printArray(arr);
        System.out.println("==================================================================");


        //Сортировка вставкой_2 // в центральном методе метод работает с разбором
        System.out.println("Сортировка вставкой: №2 ");
        ISortMetods insertionSort_2 = new InsertionSort_2();
        insertionSort_2.sortMetodAlgoritms(arr);
//        iPrintArray.printArray(arr);
        System.out.println("==================================================================");

        //Сортировка слиянием
        System.out.println("Сортировка слиянием:");
        ISortMetods mergeSort = new MergeSort();
        mergeSort.sortMetodAlgoritms(arr);
//        iPrintArray.printArray(arr);
        System.out.println("==================================================================");

        //Быстрая сортировка
        System.out.println("Сортировка быстрая:");
        ISortMetods quickSort = new QuickSort();
        quickSort.sortMetodAlgoritms(arr);
//        iPrintArray.printArray(arr);
        System.out.println("==================================================================");

        //сортировка выбором
        System.out.println("Сортировка выбором:");
        ISortMetods selectionSort = new SelectionSort();
        selectionSort.sortMetodAlgoritms(arr);
//        iPrintArray.printArray(arr);
        System.out.println("==================================================================");


        //homeWork#3
//        System.out.println("Разворот списка из полученного массива");
//        IreservetList ireservetList = new homework3();
//        ireservetList.hw3(arr);
//        iPrintArray.printArray(arr);
//        System.out.println("==================================================================");

    }
}

