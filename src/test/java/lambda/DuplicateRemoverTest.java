package lambda;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DuplicateRemoverTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 2, 4, 5, 1);

        List<Integer> result = DuplicateRemover.removeDuplicates(inputList);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicatesEmptyList() {
        List<Integer> emptyList = Arrays.asList();

        List<Integer> result = DuplicateRemover.removeDuplicates(emptyList);

        List<Integer> expected = Arrays.asList();
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicatesAllDuplicates() {
        List<Integer> duplicateList = Arrays.asList(1, 1, 1, 1, 1);

        List<Integer> result = DuplicateRemover.removeDuplicates(duplicateList);

        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, result);
    }
}

