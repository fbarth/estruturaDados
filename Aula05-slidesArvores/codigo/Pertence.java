public static boolean pertence(String c, NodoTernario n) {
    if(vazia(n)) return false; else{
	if (c.equals(n.getConteudo())){
	    return true;
	}else{
	    NodoTernario [] f = n.getFilhos();
	    for(int i=0; i<f.length; i++){
		if(pertence(c,f[i])){return true;}
	    }
	    return false;
}}}