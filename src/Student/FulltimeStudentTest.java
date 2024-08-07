package Student;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Student.Student;
import Student.FulltimeStudent;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FulltimeStudentTest {

    @Test
    @DisplayName("Test getID method")
    void testGetID() {
        Integer id = 123456789;
        Student s = new FulltimeStudent(id, "test");
        assertEquals(id, s.getID());
    }

    @Test
    @DisplayName("Test setID method")
    void testSetID() {
        Integer id = 123456789;
        Student s = new FulltimeStudent();
        s.setID(id);
        assertEquals(id, s.getID());
    }
}
