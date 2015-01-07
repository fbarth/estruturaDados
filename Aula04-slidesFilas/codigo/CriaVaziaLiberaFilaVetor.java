public Fila cria() {
    this.elementos = new float[N];
    this.inicio = 0;
    this.n = 0;
    return this;
}

public boolean vazia() { return (this.n == 0);}

public void libera() {	
    this.elementos = new float[N];
    this.inicio = 0;
    this.n = 0;
}