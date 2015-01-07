public static int[] bolhaRecursivo(int n, int [] v){
    for(int i=n-1; i>=1; i--){
	boolean troca = false;
	for(int j=0; j<i; j++){
	    if(v[j] > v[j+1]){
		int temp = v[j]; v[j] = v[j+1];
		v[j+1] = temp; troca = true;
	    }
	}
	if(!troca) return bolhaRecursivo(n-1,v);
    }
    return v;}