package immutableAssignment;

import junit.framework.TestCase;
import org.junit.Test;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

public class ImmutableTest extends TestCase {

    /**
     *  This method test if provided Employee class is immutable or not.
     *
     */
    @Test
    public void testEmployee(){
        // Test should pass as Employee class is immutable
        assertImmutable(Employee.class);
    }

    /**
     *  This method test if provided Student class is immutable or not.
     *
     */
    @Test
    public void testStudent(){
        // Test should pass as Student class is immutable
        assertImmutable(Student.class);
    }

    /**
     *  This method test if provided User class is immutable or not.
     *
     */
    @Test
    public void testUser(){
        // Test should fail as User class is mutable
        assertImmutable(User.class);
    }
}