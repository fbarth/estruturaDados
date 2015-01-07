public void printRecursivo(Nodo n){
    if(!isEmpty(n)){
	/*imprime o primeiro elemento*/
	System.out.println(n.getInfo());
	/*imprime a sub-lista*/
	printRecursivo(n.getProx());
    }
}