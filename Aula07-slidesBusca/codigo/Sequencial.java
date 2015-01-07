public static boolean sequencial(int x, int v[]){
    for(int i =0; i<v.length; i++){
	if(x==v[i])
	    return true;
    }
    return false;
}