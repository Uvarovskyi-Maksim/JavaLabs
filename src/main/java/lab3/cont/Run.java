package org.example.cont;
import org.example.mod.*;
 public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.createTypicalUniversity();
    }

    public void createTypicalUniversity() {
        // Create the university
        Human rector = new Human("John", "Doe", "", Sex.MALE);
        University university = new University("Example University", rector);

        // Create faculty, department, and group using respective creators
        Creator<Faculty> facultyCreator = new FacultyCreator();
        Creator<Department> departmentCreator = new DepartmentCreator();
        Creator<Group> groupCreator = new GroupCreator();

        Human head = new Human("Mark", "Johnson", "Olegovich", Sex.MALE);
        Department department = departmentCreator.create("Software Engineering", head);
     
        Human dean = new Human("Jane", "Smith", "Dmytrovich", Sex.FEMALE);
        Faculty faculty = facultyCreator.create("Computer Science", dean);


        Human groupLeader = new Human("Sarah", "Davis", "Nataliyovych", Sex.FEMALE);
        Group group = groupCreator.create("121-20-1", groupLeader);

        System.out.println("University: " + university.getName());
        System.out.println("Rector: " + university.getRector().getFirstName() + " " + university.getRector().getLastName());
        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Dean: " + faculty.getDean().getFirstName() + " " + faculty.getDean().getLastName());
        System.out.println("Department: " + department.getName());
        System.out.println("Head: " + department.getHead().getFirstName() + " " + department.getHead().getLastName());
        System.out.println("Group: " + group.getName());
        System.out.println("Group Leader: " + group.getGroupLeader().getFirstName() + " " + group.getGroupLeader().getLastName());
    }
}
