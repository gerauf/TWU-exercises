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
    public void printN() {
        assertEquals(tr.printN(8), "********");
    }


}