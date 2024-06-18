public interface Lista<T>
{
    boolean esVacia();
    void insertar(T dato);
    T eliminar(int pos);
    T acceder(int pos);
    void swap(int desde,int hacia);
    void imprimir();
}