import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Person person;
    private Bus bus;

    @Before
    public void before(){
        this.bus = new Bus("Edinburgh", 4);
        this.person = new Person();
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.personCount());
    }

    @Test
    public void busCanAddPerson() {
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        assertEquals(4, bus.personCount());
    }

//    @Test
//    public void busCanRemovePerson() {
//        bus.addPerson(person);
//        bus.addPerson(person);
//        bus.removePerson();
//        assertEquals(1, bus.personCount());
//    }

}
