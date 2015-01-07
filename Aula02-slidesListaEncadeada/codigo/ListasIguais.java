public boolean listasIguais(Nodo l1, Nodo l2){
    Nodo t1; /*objeto para percorrer l1*/
    Nodo t2; /*objeto para percorrer l2*/
    for(t1=l1, t2=l2; 
	t1 != null && t2 != null; 
	t1=t1.getProx(), t2=t2.getProx()){

	if(t1.getInfo() != t2.getInfo())
	    return false;
    }
    return true;
}