/*
 * busca por um elemento na lista
 */
public Nodo search(int i){
    for(Nodo n = prim; n != null; n = n.getProx()){
	if(n.getInfo()==i){
	    return n;
	}
    }
    return null; /* nao achou o elemento*/
}