private boolean procura(Nodo n, char c){
    if(n != null){
	if((int)n.getInfo() > (int)c)
	    return procura(n.getEsq(),c);
	else if((int)n.getInfo() < (int)c)
	    return procura(n.getDir(),c);
	else
	    return true;
    }else{
	return false;
    }
}