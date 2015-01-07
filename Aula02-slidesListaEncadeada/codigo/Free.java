public void free(){
    while (prim != null){
	Nodo temp = prim.getProx();
	prim = null;
	prim = temp;
    }
}