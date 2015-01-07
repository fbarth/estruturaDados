public class ArvoreBinaria {	
    private Nodo raiz = null;
    
    public void inserir(char c){
	raiz = inserir(raiz,c);}
	
    public void printOrdenado(){
	this.printOrdenado(raiz);}
	
    public boolean procura(char c){
	return procura(raiz,c);}
...