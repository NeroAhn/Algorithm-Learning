package com.example.codingtest.sort;

/**
 * 퀵 정렬
 */
public class Quick_Sort {

    public void sort() {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // 재귀를 위한 퀵 정렬 호출
        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void quickSort(int[] arr, int start, int end) {
        // 원소가 1개인 케이스 > 종료
        if (start >= end) return;
        // 피벗 위치는 첫번째 원소 위치
        int pivot = start;
        // 왼쪽 -> 오른쪽 방향으로의 탐색 시작은 피벗에서 바로 오른쪽 부터
        int left = start + 1;
        // 오른쪽 -> 왼쪽 방향으로의 탐색 시작은 가장 오른쪽
        int right = end;

        // 탐색 할 원소가 있다면
        while (left <= right) {
            // -> 방향으로 피벗보다 큰 데이터를 찾을 때 까지 left 를 이동
            while (left <= end && arr[left] <= arr[pivot]) {
                left++;
            }
            // <- 방향으로 피벗보다 작은 데이터를 찾을 때 까지 right 이동
            while (right > start && arr[right] >= arr[pivot]) {
                right--;
            }
            // left 와 right 를 조건에 맞게 이동 완료 후
            // left 와 right 가 엇갈렸다면 > 피벗과 작은값을 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
            // 엇갈리지 않았다면 left 와 right 교체
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // 최종 분할 이후에 왼쪽 부분과 오른쪽 부분에서 각각 퀵정렬 수행을 위한 재귀 호출
        // 피벗의 위치와 right 의 위치가 바뀌었기 때문에 현재 피벗의 위치는 right
        // 왼쪽 : start ~ right - 1
        // 오른쪽 : right + 1 ~ end
        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }
}
