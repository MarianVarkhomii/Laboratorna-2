package Laboratorna_2.Task3;

public class Mark {
    private long id;
    private int typeMark;

    public Mark() {
    }

    public Mark(final long id, final int typeMark) {
        this.id = id;
        this.typeMark = typeMark;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public int getTypeMark() {
        return typeMark;
    }

    public void setTypeMark(final int typeMark) {
        this.typeMark = typeMark;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", typeMark=" + typeMark +
                '}';
    }
}
