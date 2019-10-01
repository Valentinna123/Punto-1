
package punto.pkg1;

import javax.swing.JOptionPane;


public class Punto1 {
    
    Funciones objeto;
     
    public static void main(String[] args) {
      Punto1 ob= new  Punto1();
      ob.Punto();
    }
    public void Punto(){
      objeto=new Funciones(); 
       double rad=Double.parseDouble(JOptionPane.showInputDialog("Digite el area"));
       double resultado1 = objeto.area(rad);
       double resultado2 = objeto.volumen(rad);
       
       JOptionPane.showMessageDialog(null,"El area de la esfera es" +resultado1 );
       JOptionPane.showMessageDialog(null,"El volumen de la esfera es" +resultado2 );
         
    }
       
}
