package dsaa.algorithm.sort;

import dsaa.utils.PrintHelper;

public class BubbleSortV2 {

    private static void sort(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            // 提前退出排序标志位
            boolean flag = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                    flag = true; // 表示有数据交换
                }
            }
            if (!flag) break; // 没有数据交换，提前退出
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{4, 5, 6, 3, 2, 1};
        PrintHelper.println(data);
        sort(data, data.length);
        PrintHelper.println(data);
    }
}
