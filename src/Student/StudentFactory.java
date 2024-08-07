package Student;

public class StudentFactory {

    public static Student createStudent(String type, Integer id, String name, Double gpa) {
        if (type == null) {
            throw new IllegalArgumentException("Student type cannot be null");
        }
        switch (type.toUpperCase()) {
            case "FULLTIME":
                return new FulltimeStudent(id, name, gpa);
            // Additional student types can be added here
            default:
                throw new IllegalArgumentException("Unknown student type: " + type);
        }
    }
}
