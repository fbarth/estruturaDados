public void push(float v) {
    if(this.count >= N-1){
	System.out.println("Capacidade da pilha estorou - " +
			   "finalizando programa");
	System.exit(1);
    }
    /*inseri elemento na proxima posicao livre*/
    this.elementos[count+1] = v;
    this.count++;
}