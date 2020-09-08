/**
 * Tests for Lesson 4.
 * 
 * All tests in the folder "test" are executed 
 * when the "Test" action is invoked.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream; 

public class Lesson4Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public final void testExample() {
        Main.runExample();
        assertEquals("Joe Clay\nMarie Smith\nAnn Thompson\nJames Bond\nJennifer Atkins\nCristina Gibbs\nJason Clark\nKate Barrett\nPeter Garner\nBen Walsh\n",outContent.toString());
    }

    @Test
    public final void testExercise1() {
        Main.runExercise1();
        assertEquals("CLAY\nSMITH\nTHOMPSON\nBOND\nATKINS\nGIBBS\nCLARK\nBARRETT\nGARNER\nWALSH\n",outContent.toString());
    }

    @Test
    public final void testExercise2() {
        Main.runExercise2();
        assertEquals("Joe\nJames\nJason\nPeter\nBen\n",outContent.toString());
    }
    
    @Test
    public final void testExercise3() {
        Main.runExercise3();
        assertEquals("Joe Clay 25\nJames Bond 30\nJennifer Atkins 24\nKate Barrett 27\nBen Walsh 23\n",outContent.toString());
    }
    
    @Test
    public final void testExercise4() {
        Main.runExercise4();
        assertTrue(outContent.toString().contains("23.1"));
    }
    
    @Test
    public final void testExercise5() {
        Main.runExercise5();
        assertEquals("3\n",outContent.toString());
    }
    
    @Test
    public final void testExercise6() {
        Main.runExercise6();
        assertEquals("19 Ann Thompson\n20 Cristina Gibbs\n20 Peter Garner\n21 Jason Clark\n22 Marie Smith\n23 Ben Walsh\n24 Jennifer Atkins\n25 Joe Clay\n27 Kate Barrett\n30 James Bond\n",outContent.toString());
    }
    
    @Test
    public final void testExercise7() {
        Main.runExercise7();
        assertEquals("Atkins, Jennifer\nBarrett, Kate\nBond, James\nClay, Joe\nWalsh, Ben\n",outContent.toString());
    }
    
    @Test
    public final void testExercise8() {
        Main.runExercise8();
        assertEquals("[2000, 1999, 1998, 1997, 1996, 1995, 1994, 1992, 1989]\n",outContent.toString());
    }
}