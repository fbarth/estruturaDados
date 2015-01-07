public static int[] bolha(int [] v){
    for(int i=v.length-1; i>=1; i--){
	for(int j=0; j<i; j++){
	    if(v[j] > v[j+1]){
		int temp = v[j]; //troca
		v[j] = v[j+1];
		v[j+1] = temp;
	    }
	}
    }
    return v;
}