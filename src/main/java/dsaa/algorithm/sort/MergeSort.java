package dsaa.algorithm.sort;

import dsaa.utils.PrintHelper;

import java.util.Arrays;

public class MergeSort {

    private static int[] sort(int[] a, int n) {
        if (n < 2) {
            return a;
        }
        int mid = (int) Math.floor(n * 0.5);
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, n);
        return merge(sort(left, left.length), sort(right, right.length));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i];
                i++;
            } else {
                result[k++] = right[j];
                j++;
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }


    public static void main(String[] args) {
        int[] data = new int[]{4, 5, 6, 3, 2, 1};
        PrintHelper.println(data);
        data = sort(data, data.length);
        PrintHelper.println(data);
    }
}
