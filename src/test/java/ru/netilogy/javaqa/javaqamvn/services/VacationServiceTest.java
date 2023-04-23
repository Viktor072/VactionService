
package ru.netilogy.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {


    @Test
    public void testCalculate_positiveIncome_positiveExpenses_zeroThreshold() {
        // Переменные
        int income = 100000;
        int expenses = 50000;
        int threshold = 0;
        VacationService service = new VacationService();

        // Действие
        int result = service.calculate(income, expenses, threshold);

        // Ожидаемый и реальный результат
        Assertions.assertEquals(12, result);
    }


    @Test
    public void testCalculate_smallIncome_smallExpenses_smallThreshold() {
        // Переменные
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        VacationService service = new VacationService();

        // Действие
        int result = service.calculate(income, expenses, threshold);

        // Ожидаемый и реальный результат
        Assertions.assertEquals(3, result);
    }


    @Test
    public void testCalculate_bigIncome_bigExpenses_bigThreshold() {
        // Переменные
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        VacationService service = new VacationService();

        // Действие
        int result = service.calculate(income, expenses, threshold);

        // Ожидаемый и реальный результат
        Assertions.assertEquals(2, result);
    }


    @Test
    public void testCalculate_zeroIncome_positiveExpenses_positiveThreshold() {
        // Переменные
        int income = 0;
        int expenses = 50000;
        int threshold = 100000;
        VacationService service = new VacationService();

        // Действие
        int result = service.calculate(income, expenses, threshold);

        // Ожидаемый и реальный результат
        Assertions.assertEquals(0, result);
    }
}
