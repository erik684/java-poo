package ordenar;
import java.util.ArrayList;

public class SelectionSort {

    public ArrayList<Integer> SelectionSort(ArrayList<Integer> Vet_SelectionSort) {

        for (int i = 0; i < Vet_SelectionSort.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < Vet_SelectionSort.size(); j++) {
                if (Vet_SelectionSort.get(j) < Vet_SelectionSort.get(index)){
                    index = j;
                }
            }

            int smallerNumber = Vet_SelectionSort.get(index);
            Vet_SelectionSort.set(index, Vet_SelectionSort.get(i));
            Vet_SelectionSort.set(i, smallerNumber);
        }
        return Vet_SelectionSort;
    }

    /*public static void main(String a[]) {

        int[] Vet_SelectionSort1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] Vet_SelectionSort2 = doSelectionSort(Vet_SelectionSort1);
        for (int i : Vet_SelectionSort2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }*/

}
