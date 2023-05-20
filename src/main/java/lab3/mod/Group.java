package lab3.mod;

public class Group {
    private String name;
    private Human groupLeader;

    public Group(String name, Human groupLeader) {
        this.name = name;
        this.groupLeader = groupLeader;
    }

    public String getName() {
        return name;
    }

    public Human getGroupLeader() {
        return groupLeader;
    }
}
