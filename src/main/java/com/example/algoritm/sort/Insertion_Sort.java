package com.example.algoritm.sort;

/**
 * 삽입 정렬
 */
public class Insertion_Sort {

    public void sort() {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // 두번째 인덱스 부터 팀색
        for (int i = 1; i < n; i++) {
            // i 부터 1 까지 감소하며 비교 후 이동
            for (int j = i; j > 0; j--) {
                // 현재 선택된 원소가 바로 왼쪽 원소보다 작다면 swap
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    // 현재 선택된 원소보다 작은 원소를 만날 경우 더이상 탐색하지 않아도 되므로 stop
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
