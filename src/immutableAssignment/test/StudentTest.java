package immutableAssignment.test;

import immutableAssignment.Student;
import org.junit.Test;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

class StudentTest {

    /**
     *  This method test if provided class is immutable or not.
     *
     */
    @Test
    public void testEmployee(){
        assertImmutable(Student.class);
    }
}