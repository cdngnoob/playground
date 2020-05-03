import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StoryTest {
    
    private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static PrintStream old;
    
    @BeforeClass
    public static void setUpStreams() {
        old = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @AfterClass
    public static void cleanUpStreams() {
        System.setOut(old);
    }
    
    @Before
    public void resetOut() {
        outContent.reset();
    }
    
    
    
    @Test
    public void doSomething() {
        assert(true);
    }
}