public void print(Nodo a){
    System.out.println(a.getC());
    for(Nodo p = a.getPrim(); p!=null; p=p.getProx()){
	print(p); //imprime cada sub-arvore filha
    }
}