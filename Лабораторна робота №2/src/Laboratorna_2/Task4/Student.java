package Laboratorna_2.Task4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Student {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Set<Mark> marks;

    public Student(final Long id, final String firstName, final String lastName, final int age, final Set<Mark> marks)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
        this.marks = marks;
    }

    public Student(final Long id, final String name, final String lastname, final int age)
    {
        this(id, name,  lastname, age, new HashSet<Mark>());
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return firstName + " "  + lastName +" " + age  + "\n\t" +
                marks.stream().map(mr -> mr.toString()).collect(Collectors.joining("\n\t")) +
                "\n\tAverage mark: " + getAverageMark ();
    }

    public void addMark(final Mark mark)
    {
        marks.add(mark);
    }

    public double getAverageMark()
    {
        return marks.stream().mapToInt(Mark::getTypeMark).average().getAsDouble();
    }

    public Mark evaluationOnTheTopic(final Subject subject) {
        return marks.stream ().filter (marks -> subject.equals (marks.getSubjectName ())).findFirst ().get ();
    }
}
