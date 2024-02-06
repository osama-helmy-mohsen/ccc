//made by Luqman Al-shaabi
package q3;
import java.util.Arrays;
import java.util.ArrayList;
public class Q3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeElements(arr, 2, 4)));
    }
    public static int[] removeElements(int[] arr, int... toRemove) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (!contains(toRemove, i)) {
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static boolean contains(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {

                return true;
            }
        }
        return false;
    }
}

