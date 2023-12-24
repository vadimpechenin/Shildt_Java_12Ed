
import com.javalesson.app.ExampleApplication;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

/**
 * Класс для тестирования методов из раздела "Операции".
 * @autor Печенин Вадим
 * @version 1.0
 */
public class AllTest {
        //Класс собственно для тестирования разработанного фукнционала класса ExampleApplication
        private ExampleApplication application = new ExampleApplication();


        @BeforeSuite
        public void createApplication() {
            System.out.println("****Тесты для методов класса ExampleApplication****");
            application = new ExampleApplication();
        }

        @Test
        public void testExamples(){
            System.out.println("Тестируем примеры из книги");
            //Создание заглушки по базе счетов
            boolean result = application.showExample();
            assertTrue(result);
        }

        @AfterSuite
        public void reportReady() {
            System.out.println("****Завершены тесты для методов класса ExampleApplication****");
        }
}
