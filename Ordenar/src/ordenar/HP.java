package ordenar;

import java.util.ArrayList;

public class HP {

    public static ArrayList<Integer> heapSort(ArrayList<Integer> v) {
        buildMaxHeap(v);
        int n = v.size();

        for (int i = v.size() - 1; i > 0; i--) {
            swap(v, i, 0);
            maxHeapify(v, 0, --n);
        }
        return v;
    }

    public static void buildMaxHeap(ArrayList<Integer> v) {
        for (int i = v.size() / 2 - 1; i >= 0; i--) {
            maxHeapify(v, i, v.size());
        }

    }

    public static void maxHeapify(ArrayList<Integer> vetor, int pos, int tamanhoDoVetor) {

        int max = 2 * pos + 1, right = max + 1;
        if (max < tamanhoDoVetor) {

            if (right < tamanhoDoVetor && vetor.get(max) < vetor.get(right)) {
                max = right;
            }

            if (vetor.get(max) > vetor.get(pos)) {
                swap(vetor, max, pos);
                maxHeapify(vetor, max, tamanhoDoVetor);
            }
        }
    }

    public static void swap(ArrayList<Integer> v, int j, int aposJ) {
        int aux = v.get(j);
        //v[j] = v[aposJ];
        v.set(j, v.get(aposJ));
        //v[aposJ] = aux;
        v.set(v.get(aposJ), aux);
    }
        public static void main(String[] args) {
        //int[] v = new int[]{9, 1, 485, 111, 545, 689, 784, 113, 159, 23, 165, 89};
        //int[] numbers;
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ar.add(55);
        ar.add(2);
        ar.add(643);
        ar.add(110);
        ar.add(523);
        ar.add(754);
        ar.add(315);
        ar.add(363);
        ar.add(865);
        
       // System.out.println(ar.size());
     //   for (int i = 0; i < ar.size(); i++) {
      //      System.out.println(ar.get(i));
     //   }
        
        HP ss = new HP();
        b = ss.heapSort(ar);
      
        //for (int i = 0; i < ar.size(); i++) {
           // System.out.println(ar.get(i));
       // }

    }
}
   
   
 
   /*public static void main(String[] args) {
      int [] numbers;
      ArrayList<Integer> ar = new ArrayList<>();
      ArrayList<Integer> b = new ArrayList<>();
      ar.add(55);
      ar.add(2);
      ar.add(643);
      ar.add(111);
      ar.add(523);
      ar.add(754);
      ar.add(315);
      ar.add(363);
      ar.add(865);
      b = sort(ar);
      
   }
}*/
