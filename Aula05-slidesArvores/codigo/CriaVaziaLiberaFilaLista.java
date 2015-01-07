public Fila cria() {
    this.inicio = null;
    this.fim = null;
    return this;
}

public boolean vazia() { return (this.inicio == null);}

public void libera() {
    this.inicio = null;
    this.fim = null;
}