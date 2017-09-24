/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenar;

import java.util.ArrayList;
//import static ordenar.HP.heapSort;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class teste {
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
        
        System.out.println(ar.size());
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        
        HP ss = new HP();
        b = ss.heapSort(ar);
      
        //for (int i = 0; i < ar.size(); i++) {
           // System.out.println(ar.get(i));
       // }

    }
}
