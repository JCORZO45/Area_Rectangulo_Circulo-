package modelo;

public class Circulo extends Figura{

    public Circulo(double perimetro, double area) {
        super(perimetro, area);
       
    }
    public Circulo(double radio){
        this(radio, radio);
    }

    private double radio; 

    public void calcularPerimetro(){
        perimetro=2*3.1446*radio;
    }
    public void calcularArea(){
        area= 3.1416*radio*radio;
    }
    public double mostrarArea(){
        return this.area;
    }
    public double mostrarPerimetro(){
        return this.perimetro;
    }

    

}