public class Main
{public static void main(String[] args) {
        ListaCSE<Integer> lista = new ListaCSE<>();
        lista.insertar(7);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        lista.insertar(0);
        lista.insertar(2);
        lista.insertar(8);

        System.out.println("Lista original:");
        lista.imprimir();

        lista.swap(1, 6);

        System.out.println("Lista después de swap(1, 6):");
        lista.imprimir();
    }
}
