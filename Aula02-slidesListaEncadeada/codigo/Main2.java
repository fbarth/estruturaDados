public Main(){
    Lista lista = new Lista();
    lista.criaLista();
    System.out.println("Imprimindo valores");
    lista.print();
    lista.add(45);
    lista.add(60);
    lista.add(1);
    System.out.println("Imprimindo valores");
    lista.print();
}