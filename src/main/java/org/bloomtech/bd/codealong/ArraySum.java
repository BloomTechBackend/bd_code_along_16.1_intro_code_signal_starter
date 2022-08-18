package org.bloomtech.bd.codealong;

public class ArraySum {
    public int solution(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
