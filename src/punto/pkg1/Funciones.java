
package punto.pkg1;


public class Funciones {
    
    public double area(double radio){
        double pi=3.14;
        double area=(4*pi)*Math.pow(radio,2);
        
        return area;
    }
    public double volumen(double radio){
        double pi= 3.14;
        double vol=4*pi*(Math.pow(radio,3))/3;
        
        return vol;
    }
}
