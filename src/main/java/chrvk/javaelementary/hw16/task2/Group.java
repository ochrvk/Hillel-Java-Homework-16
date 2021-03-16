package chrvk.javaelementary.hw16.task2;

import java.util.List;

public class Group {
    private String name;
    private List<Person> persons;

    public String getName() {
        return name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }
}