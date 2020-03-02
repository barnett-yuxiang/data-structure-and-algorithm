package dsaa.algorithm.sort;

import dsaa.utils.PrintHelper;

public class BubbleSortV1 {

    private static void sort(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                }
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
