public boolean search(Nodo n, char c){
    if(n.getC()==c){
	return true;
    }else{
	for(Nodo p=n.getPrim(); p!=null; p=p.getProx()){
	    if(search(p,c))
		return true;
	}
    }
    return false;
}