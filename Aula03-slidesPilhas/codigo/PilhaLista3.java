public void push(float v) {
    NodoPilha novo = new NodoPilha();
    novo.setInfo(v);
    novo.setProx(prim);
    prim = novo;
}