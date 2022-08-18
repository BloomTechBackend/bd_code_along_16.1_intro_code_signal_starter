package org.bloomtech.bd.codealong;

class SafeDivide {
    public double solution(int numerator, int denominator) {
        if (denominator == 0) {
            return 0;
        }
        return (double) numerator/denominator;
    }
}