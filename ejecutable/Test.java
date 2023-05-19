package ejecutable; 

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;


public class Test{
    public static void main(String[] args) {
        double x= Double.parseDouble(JOptionPane.showInputDialog("Digite la figura con la que desea trabajar: \n1.Circulo \n2.Rectangulo "));

        if(x==1){
            double radio= Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo:"));
            Circulo mCirculo= new Circulo(radio);
            mCirculo.calcularArea();
            mCirculo.calcularPerimetro();

            JOptionPane.showMessageDialog(null, "EL area del circulo es:"+mCirculo.mostrarArea() +  "\nEl perimetro es: " + mCirculo.mostrarPerimetro() );
        }

        if(x==2)
        {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Digita la base del Rectangulo:  "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digita la Altura del Rectangulo:  "));

            Rectangulo mRectangulo = new Rectangulo(base, altura);
            mRectangulo.Area();
            mRectangulo.Perimetro();
            JOptionPane.showMessageDialog(null,"El area del rectangulo es : "+ mRectangulo.mostrarAreaR()+" \nEl perimetro del rectangulo es : "+mRectangulo.mostrarPerimetroR());

    }
    else 
    {
        System.exit(0);
    }
    

    }
    }