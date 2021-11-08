package Laboratorna_2.Task4;

public class Subject {
    private Long id;
    private final String nameSubject;

    public Subject(final Long id, final String name)
    {
        this.id= id;
        this.nameSubject = name;
    }

    public String getName() {
        return nameSubject;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject) && !(o instanceof String)) return false;

        return nameSubject.equals(o instanceof String ? o : ((Subject)o).nameSubject);
    }


    @Override
    public String toString() {
        return nameSubject;
    }
}
