import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("York");
        bus = new Bus("Edinburgh", 4);
        person = new Person();
    }

    @Test
    public void busStopStartsEmpty() {
        assertEquals(0, busStop.queueLength());
    }

    @Test
    public void canAddPerson(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueLength());
    }

    @Test
    public void canRemovePerson(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.queueLength());
    }

    @Test
    public void canPickUp(){
        busStop.addPerson(person);
        busStop.removePerson();
        bus.addPerson(person);
        assertEquals(0, busStop.queueLength());
        assertEquals(1, bus.personCount());
    }


}
