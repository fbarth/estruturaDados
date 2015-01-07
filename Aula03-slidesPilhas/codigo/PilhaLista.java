public class PilhaLista implements Pilha{   
    private NodoPilha prim;    
    public Pilha cria() {return null;}
    public void push(float v) {}
    public float pop() {return 0;}
    public boolean vazia() {return false;}
    public void libera() {}
}
class NodoPilha{
    private float v;
    private NodoPilha prox;
}