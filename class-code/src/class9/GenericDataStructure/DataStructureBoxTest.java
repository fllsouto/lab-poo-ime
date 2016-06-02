package class9.GenericDataStructure;

import junit.framework.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by fsouto on 19/05/16.
 */
public class DataStructureBoxTest {

    @Test
    public void testListCreation() {
        DataStructureBox box = new DataStructureBox();

        box.fillMagicBoxes(10, box.getArrayBox());
        box.fillMagicBoxes(10, box.getStackBox());
        box.fillMagicBoxes(10, box.getLinkedListBox());

        assertEquals(box.getArrayBox().size(), 10);
        assertEquals(box.getStackBox().size(), 10);
        assertEquals(box.getLinkedListBox().size(), 10);
    }

    @Test
    public void testListCopy() {
        DataStructureBox box = new DataStructureBox();

        box.fillMagicBoxes(10, box.getArrayBox());
        box.fillMagicBoxes(10, box.getLinkedListBox());
        box.copyMagicBoxed(box.getArrayBox(), box.getStackBox());

        assertTrue(box.equalMagicBoxes(box.getArrayBox(), box.getStackBox()));
        assertFalse(box.equalMagicBoxes(box.getArrayBox(), box.getLinkedListBox()));
    }
}