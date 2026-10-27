package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        int number;
        return number < 5;
        return false;
    }

    public String getAgeGroup(int age) {
        if (age >= 0 && age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 19) {
            return "Teen";
        } else if (age >= 20 && age <= 64) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();

        public boolean isValidPassword(String password) {
            if (password == null) {
        return false;
            }
            return password.length() >= 8;
        }
    }