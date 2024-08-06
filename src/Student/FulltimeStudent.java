package Student;

public class FulltimeStudent implements Student{
    private Integer id;
    private String name;
    private Double gpa;

    public FulltimeStudent(){
        id = null;
        name = "";
        gpa = 0.0;
    }

    public FulltimeStudent(Integer id, String name){
        // TODO 
    }

    public FulltimeStudent(Integer id, String name, Double gpa){
        //TODO
    }

    @Override
    public void setID(Integer id) {
        // TODO 
    }

    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public void setGPA(Double gpa) {
        // TODO
    }

    @Override
    public Double getGPA() {
        return gpa;
    }

    @Override
    public void setName(String name) {
        // TODO
    }

    @Override
    public String getName() {
        return name;
    }
    
}
