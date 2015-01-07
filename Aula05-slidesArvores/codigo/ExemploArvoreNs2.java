    //monta a hierarquia
    arv.insert(a, b);
    arv.insert(a, c);
    arv.insert(c, d);
    arv.insert(a, e);
    arv.insert(d, f);
    
    arv.print(a);    
    System.out.println(arv.search(a, 'd'));
    System.out.println(arv.search(e, 'd'));
    System.out.println(arv.getAltura(a));
}