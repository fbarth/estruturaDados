public static boolean binariaRecursiva(int x, int v[], int n){
    if(n <= 0)
	return false;
    else{
	/* deve buscar o elemento do meio*/
	int meio = n / 2;
	if(x < v[meio])
	    return binariaRecursiva(x,v,meio);
	else if(x > v[meio]){
	    return binariaRecursiva(x,copyV(v,meio),n-1-meio);
	}else
	    return true;
    }
}