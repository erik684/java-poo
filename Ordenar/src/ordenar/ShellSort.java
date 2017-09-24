package ordenar;
import java.util.ArrayList;

public class ShellSort {

    public static ArrayList<Integer> Ordenar_Shell(ArrayList<Integer> Vet_Shell) {

        int i, j, h = 1, value;
        do {
            h = 3 * h + 1;
        } while (h < Vet_Shell.size());
        do {
            h = h / 3;
            for (i = h; i < Vet_Shell.size(); i++) {
                value = Vet_Shell.get(i);
                j = i - h;
                while (j >= 0 && value < Vet_Shell.get(j)) {
                    Vet_Shell.set(j + h, Vet_Shell.get(j));
                    j = j - h;
                }
                Vet_Shell.set(j+h, value);
            }
        } while (h > 1);

        return Vet_Shell;
    }

}
