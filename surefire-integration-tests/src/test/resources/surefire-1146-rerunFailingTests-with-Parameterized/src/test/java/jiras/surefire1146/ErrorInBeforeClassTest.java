package jiras.surefire1146;

import junit.runner.Version;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ErrorInBeforeClassTest {

    private static boolean success;

    @BeforeClass
    public static void beforeClass() {
        System.out.println( "Running JUnit " + Version.id() );
        System.out.println( "success " + success );
        boolean current = success;
        success = !success;
        assertTrue( current );
    }

    @Test
    public void test() {
    }
}