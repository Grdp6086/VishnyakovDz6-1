package ru.netology.stats;

import java.sql.PreparedStatement;

public class StatsService {

    public int sumSales(int[] sales) { // сумма всех продаж
        int sum = 0;
        for (int num : sales) {
            sum = sum + num;
        }
        return sum;
    }

    public int averageSales(int[] sales) { // средняя сумма продаж в месяц
        int averSales = sumSales(sales) / 12;
        return averSales;
    }

    public int maxSalesMonth(int[] sales) { // номер месяца с макс. продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSalesMonth(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int quanMinSalesMonth (int[] sales) { // кол-во месяцев с продажами ниже среднего
        int quanMin = averageSales(sales);
        int resultQuanMin = 0;

        for (int s : sales) {
            if (s < quanMin){
                resultQuanMin = resultQuanMin + 1;
            }
        }
        return resultQuanMin;
    }

    public int quanMaxSalesMonth (int[] sales) { // кол-во месяцев с продажами выше среднего
        int quanMax = averageSales(sales);
        int resultQuanMax = 0;

        for (int s : sales) {
            if (s > quanMax) {
                resultQuanMax = resultQuanMax +1;
            }
        }
        return resultQuanMax;
    }


}

