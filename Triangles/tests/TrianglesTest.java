import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fergyo on 15/12/2016.
 */
public class TrianglesTest {

    Triangles tr = new Triangles();

    @Test
    public void printOne() {
        assertEquals(tr.printOne(), "*");
    }

    @Test
    public void printHLine() {
        assertEquals(tr.printHLine(8), "********");
    }

    @Test
    public void printVLine() {
        assertEquals(tr.printVLine(3), "*\n*\n*");
    }

    @Test
    public void printTriangle() {
        assertEquals(tr.printTriangle(3), "*\n**\n***");
    }

    @Test
    public void printIsoTriangle() {
        assertEquals(tr.printIsoTriangle(3), "  *  \n *** \n*****");
    }

   @Test
    public void printDiamond() {
        assertEquals(tr.printDiamond(3), "  *  \n *** \n*****\n *** \n  *  ");
    }

    @Test
    public void printNameDiamond() {
        assertEquals(tr.printNameDiamond("Fergus", 3), "  *  \n *** \nFergus\n *** \n  *  ");
    }


}