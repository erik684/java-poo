package ordenar;
import java.util.ArrayList;


public class MergeSort {
     
    ArrayList<Integer> array;
    int[] tempMergArr;
    int length;
     
    public ArrayList<Integer> sort(ArrayList<Integer> Vet_MergeSort) {
        this.array = Vet_MergeSort;
        this.length = Vet_MergeSort.size();
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
        return (array);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
       
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array.get(i);
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array.set(k, tempMergArr[i]);
                i++;
            } else {
                array.set(k, tempMergArr[j]);
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array.set(k, tempMergArr[i]);
            k++;
            i++;
        } 
    }
}

