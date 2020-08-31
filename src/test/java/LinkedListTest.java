import org.graalvm.compiler.hotspot.stubs.OutOfBoundsExceptionStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LinkedListTest {
    // add
    // removeHead
    // get


    // How it should ideally work.
    @Test
    public void displayWorks() {
        LinkedList list = new LinkedList();
        list.add(45);
        list.add("abc");
        list.add("Jerry");
        list.add("anatoliy");
        list.display();
    }

    @Test
    public void get_addAValue_ReturnSameValue() {
        LinkedList list = new LinkedList();
        list.add("abc");
        list.add(123);
        list.add("Roger");
        assertEquals("abc", list.get(0));
        assertEquals(123, list.get(1));

        assertEquals("abc", list.get(0));
        assertEquals(123, list.get(1));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void get_tryToRetrieveValueFromEmptyList_GetOutOfBoundsError(){
        LinkedList list = new LinkedList();
        list.get(0);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void get_indexEqualToSize_GetOutOfBoundsError(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(3);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void get_AddValuesAndThenTryToGetOUtOfBoundsValue_GetOutOfBoundsError(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(4);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void get_negativeNumber_throwOutOfBoundsException(){
        LinkedList list = new LinkedList();
        list.add(1);
        list.get(-1);
    }
}