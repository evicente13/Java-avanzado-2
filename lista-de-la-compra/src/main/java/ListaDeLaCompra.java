import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ListaDeLaCompra {

    private ArrayList<String> lista;

    public ListaDeLaCompra(String filename) {
        cargarLista(filename);
    }

    private void cargarLista(String filename) {
        try {
            lista = new ArrayList<>(Files.readAllLines(Paths.get(filename)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String obtenerElemento(int posicion) {
        if (posicion <= lista.size()) {
            return lista.get(posicion - 1);
        } else {
            return "Elemento no encontrado";
        }
    }
}
