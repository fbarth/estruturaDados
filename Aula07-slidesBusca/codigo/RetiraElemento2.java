...
}else{
     /*tem os dois filhos*/
     Nodo temp = n.getEsq();
     while(temp.getDir()!=null){
	 temp = temp.getDir();
     }
     n.setInfo(temp.getInfo());
     temp.setInfo(c);
     n.setEsq(retira(n.getEsq(),c));
}
...