private Nodo retira(Nodo n, char c){
    if(n==null){ 
	return null;
    }else if((int)n.getInfo() > (int)c){
	n.setEsq(retira(n.getEsq(),c));
    }else if((int)n.getInfo() < (int)c){
	n.setDir(retira(n.getDir(),c));
    }else{
	/*achou o elemento*/
	if(n.getEsq()==null && n.getDir()==null){
	    n = null; /*elemento sem filhos*/
	}else if(n.getEsq() == null){
	    /*so tem filho a direita*/
	    n = n.getDir();
	}else if(n.getDir() == null){
	    /*so tem filho a esquerda*/
	    n = n.getEsq();
	}else{
	    /*TODO tem os dois filhos */
	}
    }
    return n;
}