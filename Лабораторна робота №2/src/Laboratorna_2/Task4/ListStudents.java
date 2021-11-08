package Laboratorna_2.Task4;

import java.util.*;
import java.util.stream.Collectors;

public class ListStudents {
    private final Set<Subject> subjects;
    private final Map<Long, Student> students;

    public ListStudents(final Set<Subject> subjects, final Student[] students)
    {
        this.subjects = subjects;
        this.students = new HashMap<Long, Student>();
        for (final Student student : students)
            this.students.put(student.getId(), student);
    }

    public void addSubject(final Subject subject)
    {
        subjects.add(subject);
    }

    public void addSubjectAndMarks(final Subject subject, final Map<Long, Integer> marks)
    {
        addSubject(subject);
        for (final var mark : marks.entrySet())
            students.get(mark.getKey()).addMark(new Mark (mark.getValue(), mark.getValue (), subject));
    }

    public  Student getSearchStudentById(final Long id)
    {
        return students.get(id);
    }

    @Override
    public String toString() {
        return students.values().stream().map(Student::toString).collect(Collectors.joining("\n"));
    }

    public Student getTheBestMarksInStudent()
    {
        final List<Student> arrayList = new ArrayList<Student>(students.values());
        arrayList.sort(Comparator.comparingDouble(Student::getAverageMark).reversed());
        return arrayList.get(0);
    }

    public Map<Long, Integer> getMarkForTheSubjectStudents(final Subject subject)
    {
        final Map map = new HashMap<Long, Integer>();
        for (final var student: students.entrySet())
            map.put(student.getKey(), student.getValue().evaluationOnTheTopic (subject).getTypeMark ());
        return map;
    }
}
