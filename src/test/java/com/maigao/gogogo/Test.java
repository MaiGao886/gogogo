package com.maigao.gogogo;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        long start = System.currentTimeMillis();
        List<Integer> integers = test.addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9,9,9,9,9,9,9,9,9},34234234);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(Arrays.toString(integers.toArray()));

    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<Integer>();
        int n = A.length;
        for (int i = n - 1; i >= 0; --i) {
            int sum = A[i] + K % 10;
            K /= 10;
            if (sum >= 10) {
                K++;
                sum -= 10;
            }
            res.add(sum);
        }
        for (; K > 0; K /= 10) {
            res.add(K % 10);
        }
        Collections.reverse(res);
        return res;
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (hashMap.containsKey(j)){

                return new int[]{hashMap.get(j),i};
            }
            hashMap.put(nums[i],i);
        }
        throw new IllegalArgumentException();
    }
}
