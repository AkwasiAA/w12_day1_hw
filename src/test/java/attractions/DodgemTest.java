package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(14, 160, 25);
        visitor1 = new Visitor(7, 90, 10);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasPrice(){
        assertEquals(4.50, dodgems.defaultPrice(),0.01);
    }

    @Test
    public void willChargeVisitorOver12FullPrice(){
        assertEquals(4.50, dodgems.priceFor(visitor), 0.01);
    }

    @Test
    public void willChargeVisitorUnder12HalfPrice(){
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.01);
    }
}
