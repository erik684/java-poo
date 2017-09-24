package ordenar;

import java.util.ArrayList;

public class HeapSort {

    private static ArrayList<Integer> a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    public static void buildheap(ArrayList<Integer> a) {
        n = a.size() - 1;
        for (int i = n / 2; i >= 0; i--) {
            maxheap(a, i);
        }
    }

    public static void maxheap(ArrayList<Integer> a, int i) {
        left = 2 * i;
        right = 2 * i + 1;
        if (left <= n && a.get(left) > a.get(i)) {
            largest = left;
        } else {
            largest = i;
        }

        if (right <= n && a.get(right) > a.get(largest)) {
            largest = right;
        }
        if (largest != i) {
            exchange(i, largest);
            maxheap(a, largest);
        }
    }

    public static void exchange(int i, int j) {
        int t = a.get(i);
        a.set(i, j);
        a.set(j, t);
    }

    public ArrayList<Integer> sort(ArrayList<Integer> Vet_Heap) {
        a = Vet_Heap;
        buildheap(a);

        for (int i = n; i > 0; i--) {
            exchange(0, i);
            n = n - 1;
            maxheap(a, 0);
        }
        
        return Vet_Heap;
    }
   
}

