// made by Luqman Al-shaabi
package q1;
import java.util.Arrays;

public class q1 {

    public static void main(String[] args) {
        Integer[] A = {4,7,9};
        Integer[] B = {4,7,9};
        Integer[] C = {4,5,6};

        System.out.println(compareArrays(A, B));
        System.out.println(compareArrays(A, C));
    };

    public static boolean compareArrays(Object[] array1, Object[] array2) {
        return Arrays.equals(array1, array2);
    }}

    

