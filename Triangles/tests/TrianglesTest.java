import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fergyo on 15/12/2016.
 */
public class TrianglesTest {

    @Test
    public void printOne() {
        Triangles tr = new Triangles();
        assertEquals(tr.printOne(), "*");
    }


}