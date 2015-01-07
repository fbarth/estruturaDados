public class PilhaLista implements Pilha{
    private NodoPilha prim;

    public Pilha cria() {
	this.prim = null;
	return this;
    }    

    public boolean vazia() {
	return (this.prim == null);
    }

    public void libera(){this.prim = null;}
}