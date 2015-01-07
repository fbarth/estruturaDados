public void inseri(float v) {
    No novo = new No();
    novo.setInfo(v);
    novo.setProx(null);
    /*verifica se lista nao esta vazia*/
    if(this.fim != null)
	this.fim.setProx(novo);
    else
	/*fila estava vazia*/
	this.inicio = novo;
    /*fila aponta para novo elemento*/
    this.fim = novo;
}