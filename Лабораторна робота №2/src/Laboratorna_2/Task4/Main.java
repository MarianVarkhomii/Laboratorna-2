package Laboratorna_2.Task4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Subject physics = new Subject(1L,"Physics");
        final Subject english = new Subject(2L,"English");
        final Subject math = new Subject(3L,"Mathematics");

        final Set<Subject> subjects = new HashSet<Subject>(Arrays.asList(
                physics,
                english,
                math
        ));

        final ListStudents listStudents = new ListStudents (subjects, new Student[] {
                new Student (13L, "Peter", "Jackson", 22, new HashSet<Mark>(Arrays.asList(
                        new Mark(1,75, physics),
                        new Mark (2,80, english),
                        new Mark(3,90, math)
                ))),
                new Student (14L, "Marian", "Varkhomii", 18, new HashSet<Mark>(Arrays.asList(
                        new Mark(6,91, physics),
                        new Mark (5,100, english),
                        new Mark(9,92, math)
                ))),
                new Student (15L, "Victor", "Portwan",19, new HashSet<Mark>(Arrays.asList(
                        new Mark(10,91, physics),
                        new Mark (12,92, english),
                        new Mark(15,93, math)
                )))
        });
        System.out.println(listStudents);

        listStudents.addSubjectAndMarks (new Subject(4L,"Application programming"), Map.of(
                14L, 81,
                13L, 92,
                15L, 93)
        );

        System.out.println("\nAfter add subject: ");
        System.out.println(listStudents);

        System.out.println("\nThe best student: ");
        System.out.println(listStudents.getTheBestMarksInStudent ());

        listStudents.getSearchStudentById (13L);
        final Subject subjectAdd = new Subject (5L,"OOP");
        listStudents.addSubject (subjectAdd);
        System.out.println("\nMark student`s math: ");
        for (final var entries : listStudents.getMarkForTheSubjectStudents (math).entrySet())
            System.out.println(entries.getKey() + ":" + entries.getValue ());
    }
}
