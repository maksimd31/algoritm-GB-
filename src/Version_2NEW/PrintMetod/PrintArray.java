package Version_2NEW.PrintMetod;

public class PrintArray implements IPrintArray {
    /**
     * Ввыводит массив на экран
     *
     * @param arr (на вход принимает массив)
     * @return
     */
    @Override
    public int printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");


        }
        System.out.println();
        return 0;

    }
}
