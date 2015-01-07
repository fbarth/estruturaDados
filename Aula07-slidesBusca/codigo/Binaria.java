public static boolean binaria(int x, int v[]){
    int inicio = 0; int fim = v.length-1;
    int meio;
    /* enquanto a parte restante for maior que zero*/
    while(inicio <= fim){
	meio = (inicio + fim) / 2;
	if(x < v[meio])
	    fim = meio - 1;
	else if(x > v[meio])
	    inicio = meio + 1;
	else
	    return true;
    }
    return false;
}