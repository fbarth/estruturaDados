public static boolean pertence(char c, Nodo n) {
    if(vazia(n))
	return false;
    else
	return c == n.getC() || 
	    pertence(c,n.getEsq()) || 
	    pertence(c,n.getDir());
}