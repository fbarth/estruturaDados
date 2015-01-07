private char fecho(char c){
    if(c==']') return '[';
    if(c=='}') return '{';
    if(c==')') return '(';
    return 'x';
}

private boolean verificaFechamento(char[] s){
    Pilha p = new PilhaVetorChar(); p.cria();
    for(int i=0; i<s.length; i++){
	if(s[i]=='(' || s[i]=='{' || s[i]=='['){
	    p.push(s[i]);
	}else if(s[i]==')' || s[i]=='}' || s[i]==']'){
	    if(p.vazia()) return false;
	    if(p.pop()!=fecho(s[i])) return false;
	}
    }
    if(!p.vazia()) return false;
    p.libera();
    return true;
}