public boolean listasIguaisRec(Nodo l1, Nodo l2){
    if(l1 == null && l2 == null){
	return true;
    }else if(l1 == null || l2 == null){
	return false;
    }else
	return 
	  ((l1.getInfo()==l2.getInfo())
	   &&
	  listasIguaisRec(l1.getProx(),l2.getProx()));
}