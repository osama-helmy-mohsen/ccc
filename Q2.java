//made by luqman al-shaabi
package q2;
import java.util.ArrayList;
import java.util.Arrays;
public class Q2 {
    public static void main(String[] args) {
            Integer[] A = {1, 2, 3};

        Integer[] backupArray = cloneArray(A);

        System.out.println(Arrays.toString(backupArray)); 
    }

    public static Integer[] cloneArray(Integer[] array) {
        ArrayList<Integer> arrayList = new 

ArrayList<>(Arrays.asList(array));
        Integer[] backupArray = new Integer[arrayList.size()];
        backupArray = arrayList.toArray(backupArray);
        return backupArray;
    }
}

    
    

