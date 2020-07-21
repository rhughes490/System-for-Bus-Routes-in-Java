import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;
    private String name;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int queueLength(){
        return this.queue.size();
    }

    public void addPerson (Person person) {
        this.queue.add(person);
    }

    public Person removePerson() {
        return this.queue.remove(0);
    }


}
