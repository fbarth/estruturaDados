public float pop() {
    NodoPilha n;
    if(vazia()){
	System.out.println("Pilha vazia");
	System.exit(1);
    }
    n = this.prim;
    prim = n.getProx();
    return n.getInfo();
}