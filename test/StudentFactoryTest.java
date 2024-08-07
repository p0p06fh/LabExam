import org.junit.jupiter.api.Test;
import Student.Student;
import Student.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class StudentFactoryTest {

    @Test
    @DisplayName("Test creating FulltimeStudent")
    void testCreateStudent() {
        Student s = StudentFactory.createStudent("FULLTIME", 1, "Alice", 55.0);
        assertNotNull(s);
        assertEquals("Alice", s.getName());
        assertEquals(55.0, s.getGPA());
    }

    @Test
    @DisplayName("Test creating student with null type")
    void testCreateStudentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StudentFactory.createStudent(null, 2, "Bob", 45.0);
        });

        String expectedMessage = "Student type cannot be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("Test creating student with unknown type")
    void testCreateStudentUnknownType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StudentFactory.createStudent("UNKNOWN", 3, "Charlie", 60.0);
        });

        String expectedMessage = "Unknown student type: UNKNOWN";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
