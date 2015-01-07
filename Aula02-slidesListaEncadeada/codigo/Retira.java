public void remove(int i){
    /*objeto para o elemento anterior*/
    Nodo anterior = null;
    /*objeto para percorrer a lista*/
    Nodo p = prim;
		
    /*procura elemento na lista, guardando anterior*/
    while(p != null && p.getInfo() != i){
	anterior = p;
	p = p.getProx();
    }
		
    /*verifica se achou elemento*/
    if(p == null){
	/*nao achou: mantem prim da forma como estah*/
	return;
    }
		
    /*retira elemento*/
    if(anterior == null){
	/*retira elemento do inicio*/
	prim = p.getProx();
    }else{
	/*retira elemento do meio da lista*/
	anterior.setProx(p.getProx());
    }
}