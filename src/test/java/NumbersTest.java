import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ACER on 26.06.2017.
 */
public class NumbersTest {
    @Test
    public void sum() throws Exception {
            Numbers numbers=new Numbers();//Создаем экземпляр класса Numbers
            int actual=numbers.sum(5);//В переменную actual присваеваем результат работы сум для значения 5
            int expected=15;//Ожидаемое значение при этом равно 15
            assertEquals(expected,actual);//Сравниваем эти два значения при помощи функции assert Equals которая и сообщит о результате

    }

}