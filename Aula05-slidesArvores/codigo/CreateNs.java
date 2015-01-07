public Nodo create(char c){
    Nodo n = new Nodo();
    n.setC(c);
    n.setPrim(null);
    n.setProx(null);
    return n;
}