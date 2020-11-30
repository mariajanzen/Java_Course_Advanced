import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

Solution solution = new Solution();

        @Test
        public void testReverse_emptyString_returnsEmptyString() {
            assertEquals("", solution.reverse(""));
        }

        @Test
        public void testReverse2() {
            assertEquals("olleh", solution.reverse("hello"));
        }


        @Test
        public void testReverse3() {
            assertEquals("@ oL2leH", solution.reverse("Hel2Lo @"));
        }



        @Test
    public void testFindNonCouple_short() {
            ArrayList<Integer> ints = new ArrayList<>();
            ints.add(3);
            ints.add(5);
            ints.add(3);

            assertEquals(5, solution.findTheIntegerWithoutCouple(ints));
        }
    @Test
    public void testFindNonCouple_long() {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(3);
        ints.add(5);
        ints.add(3);

        assertEquals(5, solution.findTheIntegerWithoutCouple(ints));
    }

    @Test
    public void testFindNonCouple_NULL() {
        ArrayList<Integer> ints = new ArrayList<>(null);
        assertEquals((Integer) null, solution.findTheIntegerWithoutCouple(ints));
    }


}