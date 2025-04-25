package PracticePrograms;

import java.util.Arrays;

public class ArrayCopy {

    public void arrayCopy(int[] intArrayCopy){
        int[] destArrayCopy = new int[5];

        System.arraycopy(intArrayCopy, 2, destArrayCopy, 0, 5);
        System.out.println("The copied array object is: "+Arrays.toString(destArrayCopy));
    }

    public static void main(String[] args){
        ArrayCopy obj = new ArrayCopy();
        obj.arrayCopy(new int[] {2,3,4,5,6,7,8});
    }
}
