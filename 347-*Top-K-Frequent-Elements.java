class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // HashMap + Heap (Priority Queue)

        // if we generate hash map and then a array of length n, time complexity = O(nlogn)

        // if we use priority queue, the array length is k, time complexity = O(nlogk)
        // space complexity = O(n)


        if (nums.length == k){
            return nums;
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int n:nums){
            count.put(n, count.getOrDefault(n, 0) +1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (a,b) -> count.get(a) - count.get(b)
        );

        for (int n : count.keySet()){
            heap.add(n);
            if (heap.size() > k){
                heap.poll();
            }
        }

        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = heap.poll();
        }
        return ans;
    }
}