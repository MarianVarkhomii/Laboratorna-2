package Laboratorna_2.Task3;

import java.util.List;
import java.util.Map;

public class Subject {
    private long id;
    private String nameSubject;

    public Subject(final long id, final String nameSubject) {
        this.id = id;
        this.nameSubject = nameSubject;
    }

    public Subject() {
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(final String nameSubject) {
        this.nameSubject = nameSubject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", nameSubject='" + nameSubject + '\'' +
                '}';
    }
}
