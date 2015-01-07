public static int[] bolhaCurto(int [] v){
    for(int i=v.length-1; i>=1; i--){
	boolean troca = false;
	for(int j=0; j<i; j++){
	    if(v[j] > v[j+1]){
		int temp = v[j]; v[j] = v[j+1];
		v[j+1] = temp; troca = true;
	    }
	}
	if(!troca) return v;
    }
    return v;}