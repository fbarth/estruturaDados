public Nodo removeRecursivo(Nodo n, int v){
    if(!this.isEmpty(n)){
	/*verifica se o elemento a 
	 *ser retirado e o primeiro*/
	if(n.getInfo()==v){ n = n.getProx();
	}else{
	    /*retira da sub-lista*/
	    n.setProx(removeRecursivo(n.getProx(),v));
	}
    }
    return n;
}