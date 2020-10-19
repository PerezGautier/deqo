package deqo.gper.mysimplestack;

import junit.framework.TestCase;
import org.junit.Before;


public class StackOfGateauTest extends TestCase {

    StackOfGateau stackOfGateau;

    @Before
    public void setUp(){
        stackOfGateau = new StackOfGateau(5);
        stackOfGateau.push(new Gateau("cookies","chocolat",3));
    }


    public void testIsEmpty() {
        stackOfGateau.pop();
        assertTrue(stackOfGateau.isEmpty());
    }


    public void testIsNotEmpty(){
        assertFalse(stackOfGateau.isEmpty());
    }


    public void testGetSize() {
        assertEquals(stackOfGateau.getSize(),0);
    }


    public void testPush() {
        assertEquals(stackOfGateau.getSize(),0);
        stackOfGateau.push(new Gateau("cookies","chocolat",3));
        assertEquals(stackOfGateau.getSize(),1);
    }


    public void testPeek() {
        assertEquals(stackOfGateau.getSize(),0);
        stackOfGateau.peek();
        assertEquals(stackOfGateau.getSize(),0);
    }


    public void testPop() {
        assertEquals(stackOfGateau.getSize(),0);
        stackOfGateau.pop();
        assertEquals(stackOfGateau.getSize(),-1);
    }

    public void testTestToString() {
        assertEquals(stackOfGateau.toString(), "StackOfGateau{tab=[Gateau{name='cookies', ingredient='chocolat', nbIngredient=3}, null, null, null, null], capacity=5, last=0}");
    }
}