import java.util.ArrayList;

public class ListaCSE<T> implements Lista<T>
{
    private NodoSE<T> ini;
    
    public ListaCSE(){
        ini = null;
    }
    public boolean esVacia(){
        return ini == null;
    }
    public void insertar(T dato){
        NodoSE<T> p,ult ;
        p = new NodoSE<T>(dato);
        if(esVacia()){
            ini = p;
            ini.setSuc(ini);
        }else{
            ult = buscarUlt(ini);
            ult.setSuc(p);
            p.setSuc(ini);
        }
    }
    private NodoSE<T> buscarUlt(NodoSE<T> q){
        NodoSE<T> nodo;
        if(q.getSuc() == ini){
            nodo = q;
        }else{
            nodo = buscarUlt(q.getSuc());
        }
        return nodo;
    }
    public T eliminar(int pos){
        T dato;
        NodoSE<T> q, s;
        if(esVacia()){
            dato = null;
        }else{
            q = buscar(pos, ini);
            s = q.getSuc();
            dato = q.getDato();
            q.setDato(s.getDato());
            q.setSuc(s.getSuc());
            if(s == ini) ini = q;
            if(s == q) ini = null;
        }
        return dato;
    }
    private NodoSE<T> buscar(int pos, NodoSE<T> q){
        NodoSE<T> nodo;
        if(pos == 0)nodo = q;
        else        nodo = buscar(pos-1,q.getSuc());
        return nodo;
    }
    public T acceder(int pos){
        T dato;
        NodoSE<T> q;
        if(esVacia()){
            dato = null;
        }else{
            q = buscar(pos,ini);
            dato = q.getDato();
        }
        return dato;
    }
    
    public void swap(int desde,int hacia){
        T dato1 = acceder(desde);
        T dato2 = acceder(hacia);
        NodoSE<T> a,b;
        if(!esVacia()){
            a = buscar(desde,ini);
            a.setDato(dato2);
            b = buscar(hacia,ini);
            b.setDato(dato1);
        }
    }
    
    public void imprimir(){
        if(esVacia()){
            System.out.println("La lista está vacía.");
            return;
        }

        NodoSE<T> actual = ini;
        ArrayList<T> elementos = new ArrayList<>();

        do {
            elementos.add(actual.getDato());
            actual = actual.getSuc();
        } while(actual != ini);

        System.out.println(elementos);
    }
}
