import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


public class StatsServiceTest {
    @Test
    public void shouldFindMinSalesMonth() { // Поиск месяца с мин продажами
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSalesMonth(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindSumSales() { // Сумма всех продаж
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindAverageSales() { // средняя сумма продаж
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindMaxSalesMonth() { // поиск месяца с максимальной продажей
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSalesUnderAverage() { // колличество месяцев с продажами ниже среднего
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.quanMinSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSalesUpAverage() { // кол-вл месяцев с продажами выше среднего
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.quanMaxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }
}
