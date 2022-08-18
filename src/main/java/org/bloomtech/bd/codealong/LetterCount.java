package org.bloomtech.bd.codealong;

class LetterCount {
    public int solution(String s, char letter) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter)
                count++;
        }
        return count;
    }
}
