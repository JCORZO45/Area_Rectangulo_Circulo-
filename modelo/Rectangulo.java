package modelo;

public class Rectangulo extends Figura{
    
    private double altura; 
    private double base; 

    public Rectangulo(double altura, double base){
        super();
        this.altura=altura;
        this.base=base;

    }
    public void Area(){
        area=base*altura;
    }
    public void Perimetro(){
        perimetro= 2*(base+altura);
    }
    public double mostrarAreaR(){
        return this.area;

    }
    public double mostrarPerimetroR(){
        return this.perimetro;
    }

}