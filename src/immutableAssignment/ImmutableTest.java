package immutableAssignment;

import junit.framework.TestCase;
import org.junit.Test;

import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

/**
 *  This is a test class for immutable class
 *
 * @author sudhilgauchan
 * @since May 2023
 */

public class ImmutableTest extends TestCase {

    /**
     *  This method test if provided Employee class is immutable or not.
     *
     * @return void
     */
    @Test
    public void testEmployee(){
        // Test should pass as Employee class is immutable
        assertImmutable(Employee.class);
    }

    /**
     *  This method test if provided Student class is immutable or not.
     *
     *  @return void
     */
    @Test
    public void testStudent(){
        // Test should pass as Student class is immutable
        assertImmutable(Student.class);
    }

    /**
     *  This method test if provided User class is immutable or not.
     *
     *  @return void
     */
    @Test
    public void testUser(){
        // Test should fail as User class is mutable
        assertImmutable(User.class);
    }
}