package org.launchcode.java.demos.lsn6inheritance;
import  org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }

    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertNotNull(keyboardCat.getWeight());
    }

    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        keyboardCat.eat();
        assertFalse(keyboardCat.isHungry());
        assertTrue(keyboardCat.isTired());
    }
}
