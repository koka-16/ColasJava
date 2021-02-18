import java.util.StringJoiner;

public class Cola {
    private Nodo inicio;
    private Nodo finall;
    private Integer tamanio;

    public Cola()
    {
        this.inicio = null;
        this.finall = null;
        this.tamanio = 0;
    }

    //metodo que verifica si la cola eta vacia
    public boolean estaVacia()
    {
        return  (this.inicio == null && this.finall == null);
    }

    //metodo insertar
    public void encolar(Integer dato)
    {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);

        if (estaVacia())
        {
            this.inicio = nuevo;
            this.finall = nuevo;
        }
        else
        {
            finall.setSiguiente(nuevo);
            this.finall = nuevo.getSiguiente();
        }

        this.tamanio ++;
    }

    //elimina el primer nodo de la cola
    public int desencolar()
    {
        if(estaVacia())
        {
            return 0;
        }
        else
        {

            this.tamanio --;
            return 1;
        }
    }

    //muestra el primer elemento de la cola
    public String frente()
    {
        return this.inicio.getDato().toString();
    }

    //muestra el tamaño de la cola
    public String tamanio()
    {
        return this.tamanio().toString();
    }

}
