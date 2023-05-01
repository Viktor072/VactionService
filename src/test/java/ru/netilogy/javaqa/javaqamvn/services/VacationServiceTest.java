
package ru.netilogy.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {


    @Test
    public void testCalculate_smallIncome_smallExpenses_smallThreshold() {
        // Переменные
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        VacationService service = new VacationService();

        // Действие
        int result = service.calculate(income, expenses, threshold);

        // Ожидаемый и реальный результат
        Assertions.assertEquals(3, result);
    }


    @Test
    public void testCalculate_bigIncome_bigExpenses_bigThreshold() {
        // Переменные
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        VacationService service = new VacationService();

        // Действие
        int result = service.calculate(income, expenses, threshold);

        // Ожидаемый и реальный результат
        Assertions.assertEquals(2, result);
    }
}
