public int getAltura(Nodo n){
    int hmax = -1; /*caso de arvore sem filhos*/
    for(Nodo p=n.getPrim(); p!=null; p=p.getProx()){
	int h = getAltura(p);
	if(h > hmax)
	    hmax = h;
    }
    return hmax + 1;
}