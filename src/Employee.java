import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int division;
    private int salary;
    private final int id;
    public static int counter = 1;

    public Employee(String lastName, String firstName, String middleName, int division, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.division = division;
        this.salary = salary;
        this.id = getId();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDivision() {
        return division;
    }

    public int getSalary() {
        return salary;
    }

    public static int getId() {
        return counter++;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ": отдел " + division + ", зарплата " + salary + ", id " + id;
    }
}
