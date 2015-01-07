private void printOrdenado(Nodo n){
    if(n!=null){
	printOrdenado(n.getEsq());
	System.out.print(n.getInfo()+" - ");
	printOrdenado(n.getDir());
    }
}