public float pop() {
    float v;
    if(this.vazia()){
	System.out.println("Pilha vazia - " +
			   "finalizando o programa");
	System.exit(1);
    }
    /*retira elemento do topo*/
    v = this.elementos[count];
    this.count--;
    return v;
}