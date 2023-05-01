package ru.netilogy.javaqa.javaqamvn.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                counter++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;

            }
        }
        return counter;

    }
}

