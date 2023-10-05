package task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListOperationTes {
    @Test
    public void sumListsShouldBeCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));

        List<Integer> resultTest = ListOperations.sumLists(list1, list2);
        assertEquals(result, resultTest, "Resulting list is not correct");

    }

    @Test
    public void findMaxShouldBeCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 0, 5));
        int maxNumber = 5;
        int maxNumberTest = ListOperations.findMax(list1);
        assertEquals(maxNumber, maxNumberTest, "Max list element is not correct");

    }

    @Test
    public void filterStringsShouldBeCorrect() {
        List<String> list1 = new ArrayList<>(
                Arrays.asList("apple", "sony", "samsung", "honor", "google", "oppo", "xiaomi"));
        int minLength = 6;
        List<String> result = new ArrayList<>(Arrays.asList("samsung", "google", "xiaomi"));
        List<String> resultTest = ListOperations.filterStrings(list1, minLength);
        assertEquals(result, resultTest, "Resulting list is not correct");

    }
}
