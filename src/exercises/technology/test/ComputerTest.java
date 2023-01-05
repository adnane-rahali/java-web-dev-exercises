package exercises.technology.test;

import exercises.technology.Computer;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerTest {
    @Test
    public void constructorTest(){
        Computer computer_test = new Computer(1000.00, "Apple", "MacBook", 1200.99,
                                                "new");
        assertEquals(computer_test.getWeight(), 1000.00, 0.001);
        assertEquals(computer_test.getMake(), "Apple");
        assertEquals(computer_test.getModel(), "MacBook");
        assertEquals(computer_test.getPrice(), 1200.99, 0.001);
        assertEquals(computer_test.getCondition(), "new");
        assertEquals(computer_test.getId(), 1);


        Computer computer_test1 = new Computer(1000.00, "Samsung", "MacBook", 1200.99,
                "new");
        assertEquals(computer_test1.getId(), 2);
    }

    @Test
    public void isHeavyTest(){
        Computer computer_test = new Computer(1000.00, "Apple", "MacBook", 1200.99,
                "new");
        assertFalse(computer_test.isHeavy());
    }
    @Test
    public void isNewTest(){
        Computer computer_test = new Computer(1000.00, "Apple", "MacBook", 1200.99,
                "new");
        assertTrue(computer_test.isNew());

        Computer computer_test1 = new Computer(1000.00, "Apple", "MacBook", 1200.99,
                "old");
        assertFalse(computer_test1.isNew());
    }
}
