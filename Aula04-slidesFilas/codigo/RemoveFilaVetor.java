public float retira() {
    float v;
    if(vazia()){
	System.out.println("Fila vazia."
	   + "Nao eh possivel remover nenhum elemento.");
	return 0;
    }
    /*retira elemento do inicio da fila*/
    v = this.elementos[inicio];
    this.inicio = (this.inicio + 1) % N;
    this.n--;
    return v;
}