import java.util.Arrays;
import java.util.Comparator;

public class Assignement2 {

    public static void main(String[] args) {
//        How to reverse an array in the subset of N? e.g. Input: [111,113,115,227,229,237,515,517,519], Output: [115,113,111,237,229,227,519,517,515].

        Integer[] a = new Integer[]{111, 113, 115, 227, 229, 237, 515, 517, 519};
        int n = 3;
        Integer[] b = new Integer[a.length];
        for (int i = 0; i < (a.length / n) ; i++) {
            Integer[] c = new Integer[n];
            System.arraycopy(a, i * n, c, 0, n);
            Arrays.sort(c, Comparator.reverseOrder());
            System.arraycopy(c, 0, b, i * n, n);
        }

        System.out.println(Arrays.toString(b));
    }

}

