import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ListaDeLaCompra {

    private ArrayList<String> lista;

    public ListaDeLaCompra(String filename) throws IOException {
        cargarLista(filename);
    }

    private void cargarLista(String filename) throws IOException {

        lista = new ArrayList<>(Files.readAllLines(Paths.get(filename)));

    }

    public String obtenerElemento(int posicion) {
        if (posicion <= lista.size()) {
            return lista.get(posicion - 1);
        } else {
            return "Elemento no encontrado";
        }
    }
}
