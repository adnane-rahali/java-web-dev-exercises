package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LaptopTest {
    @Test
    public void constructorTest(){
        Laptop laptop_test = new Laptop(1000.00, "Apple", "MacBook", 1200.99, "new",
                                        "2in1");
        assertEquals(laptop_test.getWeight(), 1000.00, 0.001);
        assertEquals(laptop_test.getMake(), "Apple");
        assertEquals(laptop_test.getModel(), "MacBook");
        assertEquals(laptop_test.getPrice(), 1200.99, 0.001);
        assertEquals(laptop_test.getCondition(), "new");
        assertEquals(laptop_test.getType(), "2in1");
        assertEquals(laptop_test.getId(), 1);


        Computer laptop_test1 = new Computer(1000.00, "Samsung", "MacBook", 1200.99,
                "new");
        assertEquals(laptop_test1.getId(), 2);
    }

    @Test
    public void isDealTest(){
        Laptop laptop_test = new Laptop(1000.00, "Apple", "MacBook", 1200.99, "new",
                "2in1");
        assertFalse(laptop_test.isDeal());
    }

    @Test
    public void isHeavyTest(){
        Laptop laptop_test = new Laptop(1000.00, "Apple", "MacBook", 1200.99, "new",
                "2in1");
        assertFalse(laptop_test.isHeavy());
    }
}
