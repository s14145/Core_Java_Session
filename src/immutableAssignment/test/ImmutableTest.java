package immutableAssignment.test;

import immutableAssignment.Employee;
import immutableAssignment.Student;
import org.junit.Test;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

class ImmutableTest {

    /**
     *  This method test if provided Student class is immutable or not.
     *
     */
    @Test
    public void testStudent(){
        //Test should pass as Student class is immutable
        assertImmutable(Student.class);
    }

    /**
     *  This method test if provided Employee class is immutable or not.
     *
     */
    @Test
    public void testEmployee(){
        // Test should pass as Employee class is immutable
        assertImmutable(Employee.class);
    }
}