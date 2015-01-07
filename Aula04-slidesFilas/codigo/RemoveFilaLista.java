public float retira() {
    No temp;
    float v;
    if(vazia()){
	System.out.println("A fila esta vazia");
	return 0;
    }
    temp = this.inicio;
    v = temp.getInfo();
    this.inicio = temp.getProx();
    /*verifica se a fila ficou vazia*/
    if(this.inicio == null)
	this.fim = null;
    return v;
}