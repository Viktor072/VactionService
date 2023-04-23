package ru.netilogy.javaqa.javaqamvn.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int cont = 0;

        for (int month = 1; month <= 12; month++) {
            money += income - expenses;

            if (money >= threshold) {
                cont++;
                money -= threshold;
                money = (int) Math.ceil(money - expenses / 3.0 * 2);

            }
        }
        return cont;

    }
}
