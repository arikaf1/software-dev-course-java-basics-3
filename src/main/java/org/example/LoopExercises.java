package org.example;

public class LoopExercises {
    public int sum(int n) {
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i;
        return 0;
    }

    public int sumUntilEven(int n) {
            int totalSum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    break;
                }
                totalSum += i;
            }
        return 0;
    }
}
