package chrvk.javaelementary.hw16.task1;

import java.util.List;

public class Group {
    private String name;
    private List<Person> persons;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }
}
