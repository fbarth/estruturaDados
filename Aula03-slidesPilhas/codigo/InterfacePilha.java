public interface Pilha {	
    public Pilha cria();
    public void push(float v);
    public float pop();
    public boolean vazia();
    public void libera();
}