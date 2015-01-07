public void inseri(float v) {
    int fim;
    if(this.n == N){
	System.out.println("Capacidade da fila estorou."
	    + "Nao eh posivel inserir mais elementos.");
	return;
    }
    fim = (this.inicio + this.n) % N;
    this.elementos[fim] = v;
    this.n++;
}