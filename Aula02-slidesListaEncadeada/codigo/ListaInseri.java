/*
 * insercao no inicio
 */
public void add(int i){
    Nodo novo = new Nodo();
    novo.setInfo(i);
    novo.setProx(prim);
    prim = novo;
}
