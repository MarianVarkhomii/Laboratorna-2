package Laboratorna_2.Task4;

public class Mark {
    private Integer id;
    private int typeMark;
    private final Subject subject;

    public Mark(final Integer id, final int typeMark, final Subject subject)
    {   this.id =id;
        this.typeMark = typeMark;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public int getTypeMark() {
        return typeMark;
    }

    public void setTyMark(final int typeMark) {
        this.typeMark = typeMark;
    }

    public String getSubjectName()
    {
        return subject.getName();
    }

    @Override
    public String toString() {
        return
                typeMark + " " + subject;
    }
}
