import java.util.ArrayList;

public class Bus {

  private String destination;
  private ArrayList<Person> passengers;
  private int capacity;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.passengers = new ArrayList<Person>();
        this.capacity = capacity;
    }

    public int personCount() {
        return this.passengers.size();
    }

    public void addPerson(Person person) {
        if (this.personCount() < this.capacity)
        this.passengers.add(person);
    }

//    public Person removePerson() {
//        return this.passengers.remove(0);
//    }
}