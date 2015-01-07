public TestaFilaLista(){
    Fila f = new FilaLista();
    f.cria();
		
    for(int i=0; i<100; i++)
	f.inseri(i);
			
    for(int i=0; i<110; i++)
	System.out.println("Retirou: "+f.retira());
}