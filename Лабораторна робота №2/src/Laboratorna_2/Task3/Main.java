package Laboratorna_2.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(final String[] args) {
        final Subject operSys = new Subject(1, "Operation System");
        final Subject sysProg = new Subject(2, "System Programing");
        final Subject oop = new Subject(3, "Object Oriented Programing");

        final Mark mark1forStudent = new Mark(3, 89);
        final Mark mark2forStudent = new Mark(4, 99);
        final Mark mark3forStudent = new Mark(5, 98);

        final Student student1 = new Student(1, "Marian", "Varkhomii", 18);
        student1.addMapSubjectAndMark(operSys, mark1forStudent);
        student1.addMapSubjectAndMark(sysProg, mark2forStudent);
        student1.addMapSubjectAndMark(oop, mark3forStudent);
        System.out.println(student1.toString());
    }
}
