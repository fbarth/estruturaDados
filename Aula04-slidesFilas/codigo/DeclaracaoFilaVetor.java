public class FilaVetor implements Fila{
    /*determina a qtd max de itens que a fila pode ter*/
    private static final int N = 100;
    /*armazena os elementos*/
    private float[] elementos;
    /*determina a possicao de inicio da fila*/
    private int inicio;
    /*registra a qtd de itens armazenados na fila*/
    private int n;