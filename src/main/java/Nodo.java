public class Nodo {
    private Integer dato;
    private  Nodo siguiente;

    public Nodo()
    {
        this.siguiente = null;
    }


    //metodos set y get
    public void setDato(Integer dato)
    {
        this.dato = dato;
    }

    public  Integer getDato()
    {
        return this.dato;
    }

    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente()
    {
        return this.siguiente;
    }



}
