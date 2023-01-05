package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Smartphone;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmartphoneTest {
    @Test
    public void constructorTest(){
        Smartphone smartphone_test = new Smartphone(100.00, "Apple", "MacBook", 900.99, "new",
                "black");
        assertEquals(smartphone_test.getWeight(), 100.00, 0.001);
        assertEquals(smartphone_test.getMake(), "Apple");
        assertEquals(smartphone_test.getModel(), "MacBook");
        assertEquals(smartphone_test.getPrice(), 900.99, 0.001);
        assertEquals(smartphone_test.getCondition(), "new");
        assertEquals(smartphone_test.getColor(), "black");
        assertEquals(smartphone_test.getId(), 1);


        Computer smartphone_test1 = new Computer(1000.00, "Samsung", "MacBook", 1200.99,
                "new");
        assertEquals(smartphone_test1.getId(), 2);
    }

    @Test
    public void iPhoneDealTest(){
        Smartphone smartphone_test = new Smartphone(100.00, "Apple", "MacBook", 900.99, "new",
                "black");
        assertFalse(smartphone_test.iPhoneDeal());
    }

    @Test
    public void isHeavyTest(){
        Smartphone smartphone_test = new Smartphone(100.00, "Apple", "MacBook", 900.99, "new",
                "black");
        assertFalse(smartphone_test.isHeavy());
    }
}
