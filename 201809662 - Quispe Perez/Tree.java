import java.util.ArrayList;

public class Tree<T> {
    public ArrayList<Tree<T>> childs;
    public T data;

    public Tree(T data) {
        this.data = data;
        this.childs = new ArrayList<>();
    }

    public void añadirHijo(Tree<T> hijo) {
        this.childs.add(hijo);
    }
}
