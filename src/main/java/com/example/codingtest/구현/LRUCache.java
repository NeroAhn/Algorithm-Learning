package com.example.codingtest.구현;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public class CacheItem {
        int key;
        int value;
        CacheItem prev;
        CacheItem next;
        public CacheItem(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    CacheItem head;
    CacheItem tail;
    int capacity;
    Map<Integer, CacheItem> map;

    public LRUCache(int capacity) {
        head = null;
        tail = null;
        this.capacity = capacity;
        map = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            CacheItem curr = map.get(key);
            // head 로 옮기기 (+ tail 도 함께 고려)
            if (curr != head) {
                // 현재 요소가 tail 일 경우 바로 앞의 요소를 tail 로 변경
                if (curr == tail) {
                    tail = tail.prev;
                }

                // head > head.next > curr.prev > curr > curr.next
                // curr 를 맨 앞으로 옮겨야 하므로
                // 1. curr.prev의 next 를 curr.next 를 보도록 변경
                // 2. curr의 next의 prev 를 curr 의 prev 를 보도록 변경
                // 3. curr 의 next 를 head 로 변경
                // 4. head 의 prev 를 curr 로 변경
                // 5. curr 의 prev 를 null 처리
                if (curr.prev != null) curr.prev.next = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
                curr.next = head;
                head.prev = curr;
                curr.prev = null;
                head = curr;
            }

            return curr.value;

        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (get(key) == -1) {
            // insert
            CacheItem curr = new CacheItem(key, value);
            // 최초 삽입
            if (head == null) {
                head = curr;
                tail = curr;
            } else {
                // head > head.next .... > tail.prev > tail
                // 제일 앞에 삽입
                head.prev = curr;
                curr.next = head;
                head = curr;
            }

            map.put(key, curr);

            if (map.size() > capacity) {
                // evict tail
                // head > head.next .... > tail.prev > tail
                // tail 을 제거
                map.remove(tail.key);
                tail.prev.next = null;
                tail = tail.prev;
            }
        } else {
            // update
            // head 포인터로 이동시키는 것은 get 에서 이미 구현되었으므로
            // 업데이트만 수행
            map.get(key).value = value;
        }
    }
}
