package Student;

public class FulltimeStudent implements Student {
    private Integer id;
    private String name;
    private Double gpa;

    public FulltimeStudent() {
        id = null;
        name = "";
        gpa = 0.0;
    }

    public FulltimeStudent(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.gpa = 0.0;
    }

    public FulltimeStudent(Integer id, String name, Double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public void setID(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public void setGPA(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public Double getGPA() {
        return gpa;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FulltimeStudent{id=" + id + ", name='" + name + "', gpa=" + gpa + "}";
    }
}
