
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author harry
 */
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<>();
    }

    // public void add(Person person) - add the person passed as a paramter to 
    // the list.
    public void add(Person person) {
        persons.add(person);
    }

    // public boolean isEmpty() - returns a boolean-type value true or false, 
    // that tells whether the room is empty or not.
    public boolean isEmpty() {
        return persons.isEmpty();
    }

    // public ArrayList<Person> getPersons() - returns a list of the persons 
    // in the room.
    public ArrayList<Person> getPersons() {

        return persons;
    }

    public Person shortest() {

        int shortest = Integer.MAX_VALUE;
        String name = "";

        for (Person p : persons) {
            if (p.getHeight() < shortest) {
                shortest = p.getHeight();
                name = p.getName();
            }
        }

        if (!(persons.isEmpty())) {

            return new Person(name, shortest);
        } else {
            return null;
        }
    }

    public Person take() {

        int shortest = Integer.MAX_VALUE;
        String name = "";

        for (Person p : persons) {
            if (p.getHeight() < shortest) {
                shortest = p.getHeight();
                name = p.getName();
            }
        }

        if (!(persons.isEmpty())) {
            Person pp = new Person(name, shortest);
            persons.remove(pp);
            return pp;
        }else{
            return null;
        }

    }
}
