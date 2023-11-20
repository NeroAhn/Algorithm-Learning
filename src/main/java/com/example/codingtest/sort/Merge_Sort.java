package com.example.codingtest.sort;

public class Merge_Sort {

    int[] sorted_arr;
    public void sort() {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        sorted_arr = new int[n];

        mergeSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void mergeSort(int[] arr, int start, int end) {
        // 배열의 크기가 1보다 큰 경우에만 수행
        if (start < end) {
            // 중간 위치
            int middle = (start + end) / 2;

            // 절반 중 왼쪽 부분 리스트 (start ~ middle) 분할
            mergeSort(arr, start, middle);
            // 절반 중 오른쪽 부분 리스트 (middle + 1 ~ end) 분할
            mergeSort(arr, middle + 1, end);

            // 가장 작은 단위까지 분할 되었다면 병합
            merge(arr, start, middle, end);
        }
    }

    public void merge(int[] arr, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int k = start;

        // 작은 순서대로 배열에 삽입
        // i ~ middle 그리고 j ~ end 까지
        while (i <= middle && j <= end) {
            // i 가 j 보다 작다면 i 의 값을 k 에 넣고 i 를 오른쪽으로 이동
            if (arr[i] <= arr[j]) {
                sorted_arr[k] = arr[i];
                i++;
            }
            // j 가 i 보다 작다면 j 의 값을 k 에 넣고 j 를 오른쪽으로 이동
            else {
                sorted_arr[k] = arr[j];
                j++;
            }
            // k 를 오른쪽으로 이동;
            k++;
        }
        // 남은 데이터도 마저 삽입
        // i 가 middle 보다 크다는 것은 i 가 모두 탐색이 완료 되었다는 의미
        // 이 때는 j 의 나머지 값을 k 에 넣어준다
        if (i > middle) {
            for (int rest = j; rest <= end; rest++) {
                sorted_arr[k] = arr[rest];
                k++;
            }
        }
        // 그 외에는 j 가 모두 탐색이 완료 되었다는 의미이므로
        // i 의 나머지 값을 k 에 넣어준다
        else {
            for (int rest = i; rest <= middle; rest++) {
                sorted_arr[k] = arr[rest];
                k++;
            }
        }

        // 정렬된 배열을 실제 배열로 옮긴다.
        for (int t = start; t <= end; t++) {
            arr[t] = sorted_arr[t];
        }
    }
}
