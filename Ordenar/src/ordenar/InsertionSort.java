package ordenar;
import java.util.ArrayList;

public class InsertionSort {

    public ArrayList<Integer> InsertionSort(ArrayList<Integer> Vet_InsertionSort) {
        int temp;
        
        for (int i = 1; i < Vet_InsertionSort.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (Vet_InsertionSort.get(j) < Vet_InsertionSort.get(j-1)) {
                    temp = Vet_InsertionSort.get(j);
                    Vet_InsertionSort.set(j, Vet_InsertionSort.get(j-1));
                    Vet_InsertionSort.set(j-1, temp);
                }
            }
        }
        return Vet_InsertionSort;
    }

}


/*public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for (int i = 0; i < 8; i++) {
            
            System.out.println(arr2[i]);
        }
        /*(for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }*/
