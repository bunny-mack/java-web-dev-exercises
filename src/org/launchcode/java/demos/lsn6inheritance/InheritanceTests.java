package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class InheritanceTests {
    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        assertEquals(7, keyboardCat.getWeight(), .001);
    }
}
