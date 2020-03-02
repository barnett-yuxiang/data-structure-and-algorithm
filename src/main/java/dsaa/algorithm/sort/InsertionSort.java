package dsaa.algorithm.sort;

import dsaa.utils.PrintHelper;

public class InsertionSort {

    private static void run(int[] a, int n) {
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{4, 5, 6, 3, 2, 1};
        PrintHelper.println(data);
        run(data, data.length);
        PrintHelper.println(data);
    }
}
