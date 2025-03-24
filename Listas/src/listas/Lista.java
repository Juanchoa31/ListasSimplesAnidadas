package listas;

public class Lista {
    
    private Nodo cabeza;
    private int tamanio;
    
    public Lista(){
        this.cabeza = null;
        this.tamanio = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public boolean Validar(){
        cabeza = null;
        return true;
    }
    
    public String Add(Paises p){
        
        Nodo nuevo = new Nodo(p);
        if (Validar()){
            cabeza = nuevo;
        }else{
            nuevo.setEnlace(cabeza);
            cabeza = nuevo;
        }
        tamanio++;
        return "Pais registrado";
    }
}
