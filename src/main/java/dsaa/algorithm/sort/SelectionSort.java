package dsaa.algorithm.sort;

import dsaa.utils.PrintHelper;

public class SelectionSort {

    private static void sort(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = a[min];
                a[min] = a[i];
                a[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{4, 5, 6, 3, 2, 1};
        PrintHelper.println(data);
        sort(data, data.length);
        PrintHelper.println(data);
    }
}
