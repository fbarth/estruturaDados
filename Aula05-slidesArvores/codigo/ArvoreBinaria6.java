public static void imprime(Nodo n) {
    if(!vazia(n)){
	System.out.print(n.getC()+" - ");
	imprime(n.getEsq());
	imprime(n.getDir());
    }
}