    public boolean vazia() {
	return (this.count <= -1);
    }
    
    public void libera() {
	/*nao libera de fato, apenas reinicializa*/
	this.elementos = new float[N];
	this.count = -1;
    }
}