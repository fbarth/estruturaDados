public void print(){
    for(Nodo n = prim; n != null; n = n.getProx()){
	System.out.println(n.getInfo());
    }
}
