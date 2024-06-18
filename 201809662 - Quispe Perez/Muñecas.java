import java.util.ArrayList;
import java.util.Collections;

public class Muñecas {

    public String[][] ordenar(String[] s) {
        ArrayList<String> ls = new ArrayList<>();
        Collections.addAll(ls, s);

        ArrayList<ArrayList<String>> listado = new ArrayList<>();

        while (!ls.isEmpty()) {
            ArrayList<String> grupo = new ArrayList<>();
            for (String str : new String[]{"a", "b", "c"}) {
                if (ls.contains(str)) {
                    grupo.add(str);
                    ls.remove(str);
                }
            }
            listado.add(grupo);
        }
        String[][] resultado = new String[listado.size()][];
        for (int i = 0; i < listado.size(); i++) {
            ArrayList<String> grupo = listado.get(i);
            resultado[i] = grupo.toArray(new String[0]);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Muñecas m = new Muñecas();
        String[] listaStrings = {"a", "b", "c", "a", "c", "a", "b"};
        
        String[][] resultado = m.ordenar(listaStrings);

        for (String[] fila : resultado) {
            for (String s : fila) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
