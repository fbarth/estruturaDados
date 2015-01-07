private Nodo inserir(Nodo n, char c){
    if(n != null){
	if((int)n.getInfo() > (int)c)
	    n.setEsq(inserir(n.getEsq(),c));
	else if((int)n.getInfo() < (int)c)
	    n.setDir(inserir(n.getDir(),c));
	return n;
    }else{
	n = new Nodo(); n.setInfo(c);
	n.setDir(null); n.setEsq(null);
	return n;
}}