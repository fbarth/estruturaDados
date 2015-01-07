public void printRecursivoInvertido(Nodo n){
    if(!isEmpty(n)){
	/*imprime a sub-lista*/
	printRecursivoInvertido(n.getProx());
	/*imprime o elemento*/
	System.out.println(n.getInfo());
    }
}