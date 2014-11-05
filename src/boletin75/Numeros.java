package boletin75;

import javax.swing.JOptionPane;

public class Numeros {
    
    private float numero1,numero2,numero3;
    
    public Numeros(){
        
    }
    
    public Numeros(float a,float b,float c){
        numero1=a;
        numero2=b;
        numero3=c;
    }
    
    public void setNumero1(float N1){
        numero1=N1;
    }
    public void setNumero2(float N2){
        numero2=N2;
    }
    public void setNumero3(float N3){
        numero3=N3;
    }
    public float getNumero1(){
        return numero1;
    }
    public float getNumero2(){
        return numero2;
    }
    public float getNumero3(){
        return numero3;
    }
    public float pedirDato(){
        String v= JOptionPane.showInputDialog("introducir datos");
        float valor= Float.parseFloat(v);
        return valor;
    }
    public void condicion(){
        if(numero1>numero2&&numero1>numero3){
             JOptionPane.showMessageDialog(null,numero1+ " es el más alto");  
        }
        else if(numero2>numero3&&numero2>numero1){
            
            JOptionPane.showMessageDialog(null, numero2+ " es el más alto");
            }
         else{
            JOptionPane.showMessageDialog(null, numero3+" es el más alto");
        }
        
    }

}
