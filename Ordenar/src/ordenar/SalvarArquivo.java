package ordenar;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SalvarArquivo {

    public void SalvarArquivo(ArrayList<Integer> Vet_Save) {
        JFileChooser fileChooser = new JFileChooser();
        try {

            int ReturnDial = JOptionPane.showConfirmDialog(null, "Criar novo arquivo ?");
            if (ReturnDial == JOptionPane.YES_OPTION) {
                int returnDial = fileChooser.showSaveDialog(null);
                File file = new File(String.valueOf(fileChooser.getSelectedFile()) + ".txt");
                    if (!file.exists()) {
                        file.createNewFile();
                        FileWriter fw = new FileWriter(file.getAbsoluteFile());
                        BufferedWriter out = new BufferedWriter(fw);

                        for (int x = 0; x < Vet_Save.size(); x++) {
                            System.out.println(Vet_Save.get(x));
                            out.write(Integer.toString(Vet_Save.get(x)));
                            out.newLine();
                        }
                        out.close();
                        JOptionPane.showMessageDialog(null, "Arquivo Salvo! ");
                    }
                    else {
                        if (file.exists()) {
                        JOptionPane.showMessageDialog(null, "Arquivo ja existe !");
                        }
                    }

            } else {
                JOptionPane.showMessageDialog(null, "Cancelado");
            }

            if (ReturnDial == JOptionPane.NO_OPTION) {

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

//returnDial = JOptionPane.showConfirmDialog(null, "Arquivo ja existe, substitui?");
