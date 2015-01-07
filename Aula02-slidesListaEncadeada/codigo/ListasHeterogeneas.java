public class Nodo{
    private FormasGeometricas fg;
    private Nodo prox;
}

public class abstract FormasGeometricas{
    private float b;
    private float h;
    public abstract float calculaArea();
}

public class Retangulo extends FormasGeometricas{
    public float calculaArea(){
	return b*h;
    }
}

public class Triangulo extends FormasGeometricas{
    public float calculaArea(){
	return b*h/2;
    }
}