public static void imprimePreOrdem(Nodo n) {
    if(!vazia(n)){
	System.out.print(n.getC()+" - ");
	imprimePreOrdem(n.getEsq());
	imprimePreOrdem(n.getDir());
    }
}

public static void imprimeInOrdem(Nodo n) {
    if(!vazia(n)){
	imprimeInOrdem(n.getEsq());
	System.out.print(n.getC()+" - ");
	imprimeInOrdem(n.getDir());
    }
}
	
public static void imprimePosOrdem(Nodo n) {
    if(!vazia(n)){
	imprimePosOrdem(n.getEsq());
	imprimePosOrdem(n.getDir());
	System.out.print(n.getC()+" - ");
    }
}