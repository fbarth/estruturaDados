/*
 * inseri uma nova sub-arvore como filha
 * de um dado no
 */
public void insert(Nodo a, Nodo sub_a){
    //inserindo no inicio.
    sub_a.setProx(a.getPrim());
    a.setPrim(sub_a);
}