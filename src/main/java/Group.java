import java.util.List;

public class Group {
    private String name;
    private List<Person> persons;

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }
}
