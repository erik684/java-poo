package ordenar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class LerArquivo {

    public ArrayList<Integer> ler_arquivo(JFileChooser fileChooser) {
        int x = 0;
        BufferedReader br = null;
        ArrayList<Integer> vetLine = new ArrayList<>(); // vetor que recebe outro organizado
            try {
                String sCurrentLine;
                br = new BufferedReader(new FileReader(fileChooser.getSelectedFile().getAbsoluteFile()));

                while ((sCurrentLine = br.readLine()) != null) { // armazena cada linha no vetor (vetLine)
                    x = x + 1;
                    vetLine.add(Integer.parseInt(sCurrentLine));
                }
                return vetLine;

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        
        return null;
    }
}
//BubbleSort bubble = new BubbleSort();
//Vet_Organizado = bubble.Ordenar_Bubble(vetLine);
//QuickSort quick = new QuickSort();
//Vet_Organizado = quick.sort(vetLine); 
//MergeSort merge = new MergeSort();
//Vet_Organizado = merge.sort(vetLine);
//InsertionSort sort = new InsertionSort();
//Vet_Organizado = sort.InsertionSort(vetLine);
//SelectionSort sort = new SelectionSort();
                //Vet_Organizado = sort.SelectionSort(vetLine);
