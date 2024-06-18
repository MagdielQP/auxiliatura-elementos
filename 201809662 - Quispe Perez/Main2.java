import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        // Ejemplo de creación del árbol
        Tree<String> raiz = new Tree<>("c");
        Tree<String> arbol1 = new Tree<>("a");
        Tree<String> arbol2 = new Tree<>("u");
        Tree<String> arbol3 = new Tree<>("h");
        Tree<String> arbol4 = new Tree<>("t");
        Tree<String> arbol5 = new Tree<>("t");
        Tree<String> arbol6 = new Tree<>("e");
        Tree<String> arbol7 = new Tree<>("u");
        Tree<String> arbol8 = new Tree<>("s");
        Tree<String> arbol9 = new Tree<>("p");
        Tree<String> arbol10 = new Tree<>("e");
        Tree<String> arbol11 = new Tree<>("i");
        Tree<String> arbol12 = new Tree<>("s");
        
        raiz.añadirHijo(arbol1);
        arbol1.añadirHijo(arbol4);
        arbol4.añadirHijo(arbol8);
        raiz.añadirHijo(arbol2);
        arbol2.añadirHijo(arbol5);
        arbol5.añadirHijo(arbol9);
        arbol5.añadirHijo(arbol10);
        raiz.añadirHijo(arbol3);
        arbol3.añadirHijo(arbol6);
        arbol3.añadirHijo(arbol7);
        arbol7.añadirHijo(arbol11);
        arbol7.añadirHijo(arbol12);

        // Recorrido por amplitud con agrupación por niveles
        recorrerPorNiveles(raiz);
    }

    public static <T> void recorrerPorNiveles(Tree<T> tree) {
        if (tree == null) return;

        Queue<Tree<T>> cola = new LinkedList<>();
        cola.add(tree);

        while (!cola.isEmpty()) {
            int size = cola.size();

            for (int i = 0; i < size; i++) {
                Tree<T> current = cola.poll();
                System.out.print(current.data + " ");

                for (Tree<T> child : current.childs) {
                    cola.add(child);
                }
            }
            System.out.println();
        }
    }
}
