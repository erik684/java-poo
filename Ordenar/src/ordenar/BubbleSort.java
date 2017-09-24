

package ordenar;
import java.util.ArrayList;



public class BubbleSort {
    
    public ArrayList<Integer> Ordenar_Bubble (ArrayList<Integer> Vet_Bubble) {
       int x = 0, y = 0; int aux;
       
       
        for (x = 0; x < Vet_Bubble.size()-1; x++) {
            System.out.println(x);
            for (y = 0; y < Vet_Bubble.size()-1; y++) {
                if (Vet_Bubble.get(y) > Vet_Bubble.get(y+1)) {
                    aux = Vet_Bubble.get(y);
                    Vet_Bubble.set(y, (Vet_Bubble.get(y+1)));
                    Vet_Bubble.set(y+1, aux);
                }
            }
        }
        return (Vet_Bubble);
    }
}
