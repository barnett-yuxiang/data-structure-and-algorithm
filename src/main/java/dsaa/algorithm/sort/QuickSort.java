package dsaa.algorithm.sort;

import dsaa.utils.PrintHelper;

import java.util.Arrays;

public class QuickSort {

    private static void sort(int[] a, int p, int q) {
        if (p < q) {
            int i = adjust(a, p, q);
            sort(a, p, i - 1);
            sort(a, i + 1, q);
        }
    }

    private static int adjust(int[] a, int p, int q) {
        int x = a[p];
        while (p < q) {
            while (p < q && a[q] >= x) {
                q--;
            }
            if (p < q) {
                a[p] = a[q];
                p++;
            }
            while (p < q && a[p] < x) {
                p++;
            }
            if (p < q) {
                a[q] = a[p];
                q--;
            }
        }
        a[p] = x;
        return p;
    }

    public static void main(String[] args) {
        int[] data = new int[]{4, 5, 6, 3, 2, 1};
        PrintHelper.println(data);
        sort(data, 0, data.length - 1);
        PrintHelper.println(data);
    }
}
