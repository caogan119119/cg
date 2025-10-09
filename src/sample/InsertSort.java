package sample;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] array){
        for (int i=1;i<array.length;i++){
            int insertValue = array[i];
            int j = i-1;
            for (;(j>=0) && (insertValue <array[j]);j--){
                array[j+1] = array[j];
            }
            array[j+1] = insertValue;
        }
    }
    public static void main(String[] args) {
        int[] array = {12,1,3,46,5,0,-3,12,35,16};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
