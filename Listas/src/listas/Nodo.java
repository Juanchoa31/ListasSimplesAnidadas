package listas;

public class Nodo {
    private Paises dato;
    private Nodo enlace;
    
    public Nodo(Paises dato){
        this.dato = dato;
        this.enlace = null;        
    }

    public Paises getDato() {
        return dato;
    }

    public void setDato(Paises dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    
}
