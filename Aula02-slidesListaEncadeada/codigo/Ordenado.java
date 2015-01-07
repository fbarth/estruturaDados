public void addOrdenado(int i){
    Nodo novo;
    /*objeto para o elemento anterior*/
    Nodo anterior = null;
    /*objeto para percorrer a lista*/
    Nodo p = prim;
		
    /*procura elemento na lista, guardando anterior*/
    while(p != null && p.getInfo() < i){
	anterior = p;
	p = p.getProx();
    }
    
    /*cria novo elemento*/
    novo = new Nodo();
    novo.setInfo(i);
    
    /*encadeia o elemento*/
    if(anterior == null){ /*inseri o elemento no inicio*/
	novo.setProx(prim);
	prim = novo;
    }else{ /*inseri elemento no meio da lista*/
	novo.setProx(anterior.getProx());
	anterior.setProx(novo);
    }
}