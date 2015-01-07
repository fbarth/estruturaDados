public class PilhaVetor implements Pilha{

    /*numero maximo de elementos*/
    private final static int N = 50;
    private int count = -1;
    private float[] elementos;
    
    public Pilha cria() {
	this.elementos = new float[N];
	return this;
    }