package Laboratorna_2.Task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private double age;
    private Map<Subject, Mark> subjectToMark = new HashMap<Subject,Mark> ();

    public Student() {
    }

    public Student(final long id, final String firstName, final String lastName, final double age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(final double age) {
        this.age = age;
    }

    public Map<Subject, Mark> getSubjectToMark() {
        return subjectToMark;
    }

    public void setSubjectToMark(final Map<Subject, Mark> subjectToMark) {
        this.subjectToMark = subjectToMark;
    }

    public Map<Subject,Mark> addMapSubjectAndMark(final Subject subject, final Mark mark){
        subjectToMark.put (subject, mark);
        return subjectToMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", subjectToMark=" + subjectToMark +
                '}';
    }
}
