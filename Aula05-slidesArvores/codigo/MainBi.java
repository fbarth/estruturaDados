public Main(){
    Nodo raiz = ArvoreBinaria.criaComFilhos('a', 
		  ArvoreBinaria.criaSemFilhos('d'), 
	          ArvoreBinaria.criaSemFilhos('e'));
		
    if(ArvoreBinaria.pertence('f', raiz))
	System.out.println("encontrou");
    else
	System.out.println("nao encontrou");
    
    ArvoreBinaria.imprime(raiz);
}